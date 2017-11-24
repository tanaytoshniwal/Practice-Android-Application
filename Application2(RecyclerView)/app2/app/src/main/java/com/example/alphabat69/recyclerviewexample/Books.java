package com.example.alphabat69.recyclerviewexample;

/**
 * Created by AlphaBAT69 on 23-11-2017.
 */

public class Books {
    private String bookName, authName,status;
    public Books(String bookName,String authName,String status){
        this.bookName=bookName;
        this.authName=authName;
        this.status=status;
    }
    //getter methods
    public String getBookName(){
        return bookName;
    }
    public String getAuthName(){
        return authName;
    }
    public String getStatus(){
        return status;
    }
    //setter methods
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public void setAuthName(String authName){
        this.authName=authName;
    }
    public void setStatus(String status){
        this.status=status;
    }
}
