package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //rw.name = "dev"; //Error: The variable "name" is not visible
        rw.setName("dev");
        System.out.println(rw.getName());
    }

  
}