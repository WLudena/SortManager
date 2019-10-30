package com.sparta.wla.exceptions;

public class SortLoaderException extends Exception {

    private String message;

    public SortLoaderException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
