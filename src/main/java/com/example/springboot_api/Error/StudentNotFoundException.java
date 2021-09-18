package com.example.springboot_api.Error;

/**
 * @author MPHuy on 18/09/2021
 */
public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(){
        super();
    }
    public StudentNotFoundException(String message){
        super(message);
    }
    public StudentNotFoundException(String message,Throwable cause){
        super(message,cause);
    }
    public StudentNotFoundException(Throwable cause){
        super(cause);
    }
    public StudentNotFoundException(String message,Throwable cause,boolean enmableSuppression,boolean writableStackTrade){
        super(message,cause,enmableSuppression,writableStackTrade);
    }

    
}
