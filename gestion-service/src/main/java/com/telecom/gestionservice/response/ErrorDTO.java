package com.telecom.gestionservice.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ErrorDTO {

    private String code;
    private String message;
    private String path;
    private List<String> details;

    public ErrorDTO() {
    }

    public ErrorDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ErrorDTO(String code, String message, String path) {
        this.code = code;
        this.message = message;
        this.path = path;
    }

    public ErrorDTO(String code, String message, String path, List<String> details) {
        this.code = code;
        this.message = message;
        this.path = path;
        this.details = details;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }
}
