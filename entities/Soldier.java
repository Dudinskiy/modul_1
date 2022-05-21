package entities;

import entities.Person;
import enums.Rank;

public class Soldier extends Person {
    private Rank rank;
    private Person commander;

    public Soldier(String name, int age) {
        super(name, age);
        rank = Rank.SOLDIER;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Person getCommander() {
        return commander;
    }

    public void setCommander(Person commander) {
        this.commander = commander;
    }

    @Override
    public void fight() {
        System.out.println("I fight!");
    }

    @Override
    public void report() {
        System.out.println("Commander, the task is completed");
    }
    public void myCommander(){
        System.out.println("My commander " + getCommander());
    }
}
