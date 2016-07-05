package com.zooz.common.client.ecomm.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zooz.common.client.ecomm.beans.enums.NotificationStatus;
import com.zooz.common.client.ecomm.beans.enums.NotificationType;
import com.zooz.common.client.ecomm.beans.responses.PaymentDetailsResponse;
import com.zooz.common.client.ecomm.beans.responses.PaymentMethodIPN;
import com.zooz.common.client.ecomm.beans.responses.ZoozIPNResponse;
import com.zooz.common.client.ecomm.beans.responses.ZoozResponseObject;
import com.zooz.common.client.ecomm.control.Controller;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by meytals on 29/02/2016.
 * IPN factory - returns the correct IPN instance
 */
public class IPNFactory {
    Logger log = Logger.getLogger(IPNFactory.class.getName());

    public ZoozIPNResponse getIPNResponse(String json, Controller controller) throws IOException {

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            ZoozIPN zoozIPN = mapper.readValue(json, ZoozIPN.class);

            NotificationType ipnType = zoozIPN.getIPNType();
            if (ipnType == null || ipnType == NotificationType.PaymentIPN) {
                return controller.parseResponse(json, new TypeReference<PaymentDetailsResponse>(){});
            } else {
                return controller.parseResponse(json, new TypeReference<PaymentMethodIPN>(){});
            }
        } catch (IOException ioe) {
            logError("Failed parsing json IO: " + ioe.getMessage() + "\nraw data: " + json);
            throw ioe;
        }
    }

    protected void logError(String message){
        log.severe(message);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class ZoozIPN implements ZoozIPNResponse {

        public ZoozIPN() {
        }

        @JsonProperty("ipnType")
        private NotificationStatus notificationStatus;

        public NotificationStatus getNotificationStatus() {
            return notificationStatus;
        }

        public void setNotificationStatus(NotificationStatus notificationStatus) {
            this.notificationStatus = notificationStatus;
        }

        @Override
        public NotificationType getIPNType() {
            NotificationType type = null;
            if (notificationStatus != null) {
                switch (notificationStatus) {
                    case RemovePaymentMethodSuccess:
                    case RemovePaymentMethodFailure:
                    case AddPaymentMethodSuccess:
                    case AddPaymentMethodFailure:
                        type = NotificationType.PaymentMethodIPN;
                        break;
                    case TransactionSuccess:
                    case TransactionFailure:
                    case RefundSuccess:
                    case RefundFailure:
                    case TransactionPending:
                    case RefundPending:
                        type =  NotificationType.PaymentIPN;
                        break;

                    case DefaultValue:
                        break;
                }
            }

            return type;
        }
    }
}

