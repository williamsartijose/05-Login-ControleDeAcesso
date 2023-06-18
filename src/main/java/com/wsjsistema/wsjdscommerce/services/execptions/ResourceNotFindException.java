package com.wsjsistema.wsjdscommerce.services.execptions;

public class ResourceNotFindException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFindException(String msg) {
        super(msg);
    }
}
