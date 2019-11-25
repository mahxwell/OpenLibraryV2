package org.mahxwell.openlib.model.exception;

public class FunctionalException extends Exception {

    /**
     * Constructor
     *
     * @param pMessage -
     */
    public FunctionalException(final String pMessage) {
        super(pMessage);
    }


    /**
     * Constructor
     *
     * @param pMessage -
     * @param pCause   -
     */
    public FunctionalException(final String pMessage, final Throwable pCause) {
        super(pMessage, pCause);
    }
}
