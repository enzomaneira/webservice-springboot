package com.educweb.course.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {


    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
