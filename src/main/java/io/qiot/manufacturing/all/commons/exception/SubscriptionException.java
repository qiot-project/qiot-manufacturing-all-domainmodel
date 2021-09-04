/**
 * 
 */
package io.qiot.manufacturing.all.commons.exception;

/**
 * @author andreabattaglia
 *
 */
public class SubscriptionException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -1430499061967941466L;

    public SubscriptionException() {
        super();
    }

    public SubscriptionException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public SubscriptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public SubscriptionException(String message) {
        super(message);
    }

    public SubscriptionException(Throwable cause) {
        super(cause);
    }

}
