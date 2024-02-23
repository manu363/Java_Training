package com.Day14.ExceptionHandling;

public class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("Invalid age.");
    }

    InvalidAgeException(String message) {
        super(message);
    }
}
