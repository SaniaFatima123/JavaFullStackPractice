package com.example.bookms.exception;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(String msg){
        super(msg);
    }
}
