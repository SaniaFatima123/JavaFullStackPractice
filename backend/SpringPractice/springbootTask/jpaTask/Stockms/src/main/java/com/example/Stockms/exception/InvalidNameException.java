package com.example.Stockms.exception;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException(String msg){
        super(msg);
    }
}
