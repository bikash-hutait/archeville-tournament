package com.example.archery.exceptions;

public class TeamNotFoundException extends RuntimeException{
    public TeamNotFoundException()
    {
     super();
    }
    public TeamNotFoundException(String msg)
    {
     super(msg);
    }
}