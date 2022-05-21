package entities;

import enums.Rank;
import interfaces.FightAble;

public abstract class Person implements FightAble {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void fight() {
        System.out.println("I can fight!");
    }

    @Override
    public void report() {
        System.out.println("The fight task is completed");
    }

    public abstract void myCommander();


}
