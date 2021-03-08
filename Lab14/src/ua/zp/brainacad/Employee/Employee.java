package ua.zp.brainacad.Employee;

import ua.zp.brainacad.Human.Human;

import java.time.LocalDate;

public class Employee extends Human {

    private LocalDate recruitment;
    private int salary;
    private boolean isPresence;


    public void goToWork(){
        System.out.println("I`m coming to work");
    }

    public void goToDinner(){
        System.out.println("I`m go to lunch ");
    }

    public void doWork(){
        System.out.println("I`m working");
    }



}
