package com.demo.springmavencrud.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class EmployeeGlobalexceptionHandler {

    @ExceptionHandler(value=NoSuchElementException.class)
    public EmployeeNotFoundException handleNotFound(NoSuchElementException ex){
        return new EmployeeNotFoundException("601", "Employee Not Found");
    }
}
