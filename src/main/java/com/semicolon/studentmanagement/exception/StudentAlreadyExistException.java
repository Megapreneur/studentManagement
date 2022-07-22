package com.semicolon.studentmanagement.exception;

public class StudentAlreadyExistException extends IllegalArgumentException{
    public StudentAlreadyExistException(String message) {
        super(message);
    }
}
