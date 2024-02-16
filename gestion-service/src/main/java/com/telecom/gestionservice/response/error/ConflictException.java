package com.telecom.gestionservice.response.error;

public class ConflictException extends RuntimeException{

    private static final String DESCRIPCION = "Conflict Exception (409)";

    public ConflictException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}
