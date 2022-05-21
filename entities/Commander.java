package entities;

import enums.Rank;

public class Commander extends Person {
    private Rank rank;
    private Soldier[] staff;
    private Person commander;

    public Commander(String name, int age) {
        super(name, age);
        rank = Rank.COMMANDER;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Soldier[] getStaff() {
        return staff;
    }

    public void setStaff(Soldier[] staff) {
        this.staff = staff;
    }

    public Person getCommander() {
        return commander;
    }

    public void setCommander(Person commander) {
        this.commander = commander;
    }

    @Override
    public void fight() {
        System.out.println("General, i understood the task");
        ;
    }

    @Override
    public void report() {
        System.out.println("General, the fight task is completed");
    }

    public void myCommander(){
        System.out.println("My commander " + getCommander());
    }
}
