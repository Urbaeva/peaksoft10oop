package com.company;

public class Main {
    public static void main(String[] args) {
        Person programmer = new Programmer();
        Person dancer = new Dancer();
        Person singer = new Singer();
        Person[] persons = {programmer, dancer, singer};

        for (Person person: persons) {
            person.walk();
        }
    }
}
