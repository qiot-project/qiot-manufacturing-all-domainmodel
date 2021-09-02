/**
 * 
 */
package io.qiot.manufacturing.all.commons.exception;

/**
 * @author andreabattaglia
 *
 */
public class DataValidationException extends Exception {

    private static final long serialVersionUID = 5836939944463120394L;

    public DataValidationException() {
        super();
    }

    public DataValidationException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidationException(String message) {
        super(message);
    }

    public DataValidationException(Throwable cause) {
        super(cause);
    }

}
