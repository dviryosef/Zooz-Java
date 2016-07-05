package com.zooz.common.client.ecomm.beans.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zooz.common.client.ecomm.beans.enums.NotificationType;

/**
 * Created by meytals on 29/02/2016.
 * All zooz ipn have ti implement this interface in order to differentiate between them
 */
public interface ZoozIPNResponse {
    NotificationType getIPNType();
}
