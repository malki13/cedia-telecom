package com.telecom.gestionservice.response;

import com.telecom.gestionservice.response.error.*;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.nio.file.AccessDeniedException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class RestExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({NotFoundExeption.class})
    @ResponseBody
    public ErrorDTO notFoundRequest(HttpServletRequest request, Exception exception) {
        return new ErrorDTO(HttpStatus.NOT_FOUND.toString(), exception.getMessage(), request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            BadRequestException.class,
            DuplicateKeyException.class,
            MethodArgumentNotValidException.class,
            MissingRequestHeaderException.class,
            MissingServletRequestParameterException.class,
            MethodArgumentTypeMismatchException.class,
            HttpMessageNotReadableException.class,
            ConstraintViolationException.class,
            InvalidDataAccessApiUsageException.class,
            NullPointerException.class,
            IllegalStateException.class,
            MissingPathVariableException.class,
            HttpClientErrorException.class,
            HttpServerErrorException.class,
            ParseException.class,
//            JSONException.class,
    })
    @ResponseBody
    public ErrorDTO badRequest(HttpServletRequest request, Exception exception) {
        return new ErrorDTO(HttpStatus.BAD_REQUEST.toString(), exception.getMessage(), request.getRequestURI());
//        ErrorDTO errorDTO = new ErrorDTO(HttpStatus.BAD_REQUEST.toString(), exception.getMessage(), request.getRequestURI());
//        List<String> details = new ArrayList<>();
//        if (exception.getMessage() != null) details.add(.);
//        errorDTO.setDetails(details);
//        return errorDTO;
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({ForbiddenException.class})
    @ResponseBody
    public ErrorDTO forbiddenRequest(HttpServletRequest request, Exception exception) {
        return new ErrorDTO(HttpStatus.FORBIDDEN.toString(), exception.getMessage(), request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({ConflictException.class})
    @ResponseBody
    public ErrorDTO conflictRequest(HttpServletRequest request, Exception exception) {
        return new ErrorDTO(HttpStatus.CONFLICT.toString(), exception.getMessage(), request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({
            UnauthorizedException.class,
            AccessDeniedException.class
    })
    @ResponseBody
    public void unauthorizedRequest() {
        //return new ErrorDTO(HttpStatus.UNAUTHORIZED.toString(), exception.getMessage(), request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({
            Exception.class
    })
    @ResponseBody
    public ErrorDTO fatalErrorUnexpectedException(HttpServletRequest request, Exception exception) {
        ErrorDTO errorDTO = new ErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR.toString(), "Excepción no controlada en la aplicación: " + exception.getMessage(), request.getRequestURI());
        List<String> details = new ArrayList<>();
        if (exception.getMessage() != null) details.add(exception.getMessage());
        if (exception.getCause().getMessage() != null) details.add(exception.getCause().getMessage());
        if (exception.getCause().getCause().getMessage() != null)
            details.add(exception.getCause().getCause().getMessage());
        errorDTO.setDetails(details);
        return errorDTO;
    }


}
