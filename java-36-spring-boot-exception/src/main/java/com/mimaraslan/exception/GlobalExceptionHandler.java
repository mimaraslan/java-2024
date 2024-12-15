package com.mimaraslan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

   @ExceptionHandler (Exception.class)
   public ResponseEntity<?> globalException( Exception ex, WebRequest request) {

       ErrorDetails errorDetails = new ErrorDetails(
               new Date(),
               ex.getMessage(),
               request.getDescription(false),
               500);

       return new ResponseEntity<>( errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
   }



    @ExceptionHandler (ResourceNotFoundException_404.class)
    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException_404 ex, WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails(
                new Date(),
                ex.getMessage(),
                request.getDescription(false),
                404);

        return new ResponseEntity<>( errorDetails, HttpStatus.NOT_FOUND);
    }




}
