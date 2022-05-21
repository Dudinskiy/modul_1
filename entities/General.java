package entities;

import enums.Rank;

public class General extends Person {
    private Rank rank;
    private Commander[] staff;

    public General(String name, int age) {
        super(name, age);
        rank = Rank.GENERAL;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Commander[] getStaff() {
        return staff;
    }

    public void setStaff(Commander[] staff) {
        this.staff = staff;
    }
    public void myCommander(){
        System.out.println("I am Main");
    }
}
