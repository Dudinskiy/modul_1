import entities.Commander;
import entities.General;
import entities.Person;
import entities.Soldier;

public class Main {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier("Name1", 22);
        Soldier soldier2 = new Soldier("Name2", 22);
        Soldier soldier3 = new Soldier("Name3", 22);
        Soldier soldier4 = new Soldier("Name4", 22);
        Soldier soldier5 = new Soldier("Name5", 22);
        Soldier soldier6 = new Soldier("Name6", 22);

        Commander commander1 = new Commander("Name1", 40);
        Commander commander2 = new Commander("Name2", 40);

        soldier1.setCommander(commander1);
        soldier2.setCommander(commander1);
        soldier3.setCommander(commander1);

        soldier4.setCommander(commander2);
        soldier5.setCommander(commander2);
        soldier6.setCommander(commander2);

        Soldier[] commander1Staff = new Soldier[3];
        Soldier[] commander2Staff = new Soldier[3];

        commander1Staff[0] = soldier1;
        commander1Staff[1] = soldier2;
        commander1Staff[2] = soldier3;

        commander2Staff[0] = soldier4;
        commander2Staff[1] = soldier5;
        commander2Staff[2] = soldier6;

        commander1.setStaff(commander1Staff);
        commander2.setStaff(commander2Staff);

        General general = new General("Name", 60);
        Commander[] generalStaff = new Commander[2];

        generalStaff[0] = commander1;
        generalStaff[1] = commander2;

        general.setStaff(generalStaff);

        commander1.setCommander(general);
        commander2.setCommander(general);

        Person[] stab = new Person[9];
        stab[0] = soldier1;
        stab[1] = soldier2;
        stab[2] = soldier3;
        stab[3] = soldier4;
        stab[4] = soldier5;
        stab[5] = soldier6;
        stab[6] = commander1;
        stab[7] = commander2;
        stab[8] = general;

        for (Person person : stab){
            person.myCommander();
        }
    }
}
