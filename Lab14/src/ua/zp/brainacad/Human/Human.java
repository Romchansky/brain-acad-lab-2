package ua.zp.brainacad.Human;


import java.time.LocalDate;

public class Human {

    private String name;
    private String surName;
    private LocalDate dayOfBirth;
    private long number;

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayGoodbye(){
        System.out.println("Goodbye");
    }
}
