package com.company;

public class Programmer extends Person{
    @Override
    public void walk(){
        System.out.println("The programmer codes more than walks");
    }

    @Override
    public String toString() {
        return "Programmer{}";
    }
}
