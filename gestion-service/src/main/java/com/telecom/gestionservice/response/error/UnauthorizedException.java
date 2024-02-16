package com.telecom.gestionservice.response.error;

public class UnauthorizedException extends RuntimeException{

    private static final String DESCRIPCION = "Unauthorized Exception (401)";

    public UnauthorizedException(String message) {
        super(DESCRIPCION + ": " + message);
    }
}
