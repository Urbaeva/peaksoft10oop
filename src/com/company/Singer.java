package com.company;

public class Singer extends Person{
    @Override
    public void walk(){
        System.out.println("The singer sings while walking");
    }

    @Override
    public String toString() {
        return "Singer{}";
    }
}
