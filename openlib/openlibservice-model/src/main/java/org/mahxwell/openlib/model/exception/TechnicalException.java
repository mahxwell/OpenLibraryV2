package org.mahxwell.openlib.model.exception;

public class TechnicalException extends Exception {
    /**
     * Constructor
     *
     * @param pMessage -
     */
    public TechnicalException(String pMessage) {
        super(pMessage);
    }


    /**
     * Constructor
     *
     * @param pMessage -
     * @param pCause   -
     */
    public TechnicalException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }
}
