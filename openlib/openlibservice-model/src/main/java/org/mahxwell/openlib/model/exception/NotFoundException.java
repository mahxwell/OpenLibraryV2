package org.mahxwell.openlib.model.exception;

public class NotFoundException extends Exception {
    /**
     * Construtor
     */
    public NotFoundException() {
    }


    /**
     * Construtor
     *
     * @param pMessage -
     */
    public NotFoundException(String pMessage) {
        super(pMessage);
    }


    /**
     * Construtor
     *
     * @param pMessage -
     * @param pCause   -
     */
    public NotFoundException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

}
