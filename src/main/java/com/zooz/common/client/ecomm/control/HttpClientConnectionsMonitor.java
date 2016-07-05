package com.zooz.common.client.ecomm.control;

import org.apache.http.conn.HttpClientConnectionManager;

import java.util.concurrent.TimeUnit;

/**
 * The type Http client connections monitor.
 */
public class HttpClientConnectionsMonitor implements Runnable {
    private final HttpClientConnectionManager connMgr;
    private volatile boolean shutdown;

    /**
     * Instantiates a new Http client connections monitor.
     *
     * @param connMgr the connection manager
     */
    public HttpClientConnectionsMonitor(HttpClientConnectionManager connMgr) {
        super();
        this.connMgr = connMgr;
    }


    public void run() {
        try {
            while (!shutdown) {
                synchronized (this) {
                    wait(5000);
                   // System.out.println("Http Client connection monitor processing");
                    // Close expired connections
                    connMgr.closeExpiredConnections();
                    // Optionally, close connections
                    // that have been idle longer than 30 sec
                    connMgr.closeIdleConnections(30, TimeUnit.SECONDS);
                }
            }
        } catch (InterruptedException ex) {
            // terminate
        }
    }

    /**
     * Shutdown void.
     */
    public void shutdown() {
        shutdown = true;
        synchronized (this) {
            notifyAll();
        }
    }
}
