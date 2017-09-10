/**********************************************************************************************************************
 * Author: JIE YI (Jay)
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 2.05
 * Update Date: 08/09/2017
 **********************************************************************************************************************/

import java.util.ArrayList;

public class Ozlympic {

    public static void main (String[] args) throws Exception {
        ArrayList<Participant> participants = new ArrayList<>();
        setCyclist(participants);
        setRunner(participants);
        setSuperAthlete(participants);
        setSwimmer(participants);
        setOfficial(participants);

        Driver driver = new Driver();
        driver.start(participants);


    }

    public static void setOfficial(ArrayList participants){
        Participant official1 = new Official("OF01","Official01","VIC",50);
        Participant official2 = new Official("OF02","Official02","VIC",52);
        Participant official3 = new Official("OF03","Official03","VIC",54);
        Participant official4 = new Official("OF04","Official04","VIC",58);
        participants.add(official1);
        participants.add(official2);
        participants.add(official3);
        participants.add(official4);
        

    }

    public static void setCyclist(ArrayList participants){
        Participant cyclist1 = new Cyclist("C01","Cyc01","VIC",25);
        Participant cyclist2 = new Cyclist("C02","Cyc02","VIC",36);
        Participant cyclist3 = new Cyclist("C03","Cyc03","VIC",27);
        Participant cyclist4 = new Cyclist("C04","Cyc04","VIC",32);
        Participant cyclist5 = new Cyclist("C05","Cyc05","VIC",31);
        Participant cyclist6 = new Cyclist("C06","Cyc06","VIC",22);
        Participant cyclist7 = new Cyclist("C07","Cyc07","VIC",26);
        participants.add(cyclist1);
        participants.add(cyclist2);
        participants.add(cyclist3);
        participants.add(cyclist4);
        participants.add(cyclist5);
        participants.add(cyclist6);
        participants.add(cyclist7);

    }

    public static void setRunner(ArrayList participants){
        Participant runner1 = new Runner("R01","Run01","VIC",24);
        Participant runner2 = new Runner("R02","Run02","VIC",25);
        Participant runner3 = new Runner("R03","Run03","VIC",27);
        Participant runner4 = new Runner("R04","Run04","VIC",31);
        Participant runner5 = new Runner("R05","Run05","VIC",33);
        Participant runner6 = new Runner("R06","Run06","VIC",32);
        Participant runner7 = new Runner("R07","Run07","VIC",29);
        participants.add(runner1);
        participants.add(runner2);
        participants.add(runner3);
        participants.add(runner4);
        participants.add(runner5);
        participants.add(runner6);
        participants.add(runner7);

    }

    public static void setSwimmer(ArrayList participants){
        Participant swimmer1 = new Swimmer("S01","Swim01","VIC",23);
        Participant swimmer2 = new Swimmer("S02","Swim02","VIC",25);
        Participant swimmer3 = new Swimmer("S03","Swim03","VIC",28);
        Participant swimmer4 = new Swimmer("S04","Swim04","VIC",35);
        Participant swimmer5 = new Swimmer("S05","Swim05","VIC",25);
        Participant swimmer6 = new Swimmer("S06","Swim06","VIC",27);
        Participant swimmer7 = new Swimmer("S07","Swim07","VIC",26);
        participants.add(swimmer1);
        participants.add(swimmer2);
        participants.add(swimmer3);
        participants.add(swimmer4);
        participants.add(swimmer5);
        participants.add(swimmer6);
        participants.add(swimmer7);

    }
    
    public static void setSuperAthlete(ArrayList participants){
        Participant superAthlete1 = new SuperAthlete("SA01","Sup01","VIC",33);
        Participant superAthlete2 = new SuperAthlete("SA02","Sup02","VIC",31);
        Participant superAthlete3 = new SuperAthlete("SA03","Sup03","VIC",32);
        Participant superAthlete4 = new SuperAthlete("SA04","Sup04","VIC",34);
        participants.add(superAthlete1);
        participants.add(superAthlete2);
        participants.add(superAthlete3);
        participants.add(superAthlete4);
    }

}
