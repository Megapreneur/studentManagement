package com.semicolon.studentmanagement.exception;

public class StudentIDIsInvalidException extends IllegalArgumentException {
    public StudentIDIsInvalidException(String message) {
        super(message);
    }
}
