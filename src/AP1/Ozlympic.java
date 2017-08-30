package AP1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ozlympic {
    // todo
    // this is the main class which control all games and may be the interface
    // Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        ArrayList<Athlete> athleteList = new ArrayList<Athlete>();
        Athlete cyclist1 = new Cyclist("C01","Dario","VIC");
        Athlete cyclist2 = new Cyclist("C02","Aario","VIC");
        Athlete cyclist3 = new Cyclist("C03","Bario","VIC");
        Athlete cyclist4 = new Cyclist("C04","Cario","VIC");
        Athlete cyclist5 = new Cyclist("C05","Eario","VIC");
        Athlete cyclist6 = new Cyclist("C06","Fario","VIC");
        Athlete cyclist7 = new Cyclist("C07","Gario","VIC");

        Athlete runner1 = new Runner("R01","Jay","VIC");
        Athlete runner2 = new Runner("R02","Aay","VIC");
        Athlete runner3 = new Runner("R03","Bay","VIC");
        Athlete runner4 = new Runner("R04","Cay","VIC");
        Athlete runner5 = new Runner("R05","Day","VIC");
        Athlete runner6 = new Runner("R06","Eay","VIC");
        Athlete runner7 = new Runner("R07","Fay","VIC");

        Athlete swimmer1 = new Swimmer("S01","Vincent","VIC");
        Athlete swimmer2 = new Swimmer("S02","Vincent","VIC");
        Athlete swimmer3 = new Swimmer("S03","Vincent","VIC");
        Athlete swimmer4 = new Swimmer("S04","Vincent","VIC");
        Athlete swimmer5 = new Swimmer("S05","Vincent","VIC");
        Athlete swimmer6 = new Swimmer("S06","Vincent","VIC");
        Athlete swimmer7 = new Swimmer("S07","Vincent","VIC");

        Athlete superAthlete1 = new SuperAthlete("SA01","Maggie","VIC");
        Athlete superAthlete2 = new SuperAthlete("SA02","Aaggie","VIC");
        Athlete superAthlete3 = new SuperAthlete("SA03","Baggie","VIC");
        Athlete superAthlete4 = new SuperAthlete("SA04","Caggie","VIC");

        athleteList.add(cyclist1);
        athleteList.add(cyclist2);
        athleteList.add(cyclist3);
        athleteList.add(cyclist4);
        athleteList.add(cyclist5);
        athleteList.add(cyclist6);
        athleteList.add(cyclist7);

        athleteList.add(runner1);
        athleteList.add(runner2);
        athleteList.add(runner3);
        athleteList.add(runner4);
        athleteList.add(runner5);
        athleteList.add(runner6);
        athleteList.add(runner7);

        athleteList.add(swimmer1);
        athleteList.add(swimmer2);
        athleteList.add(swimmer3);
        athleteList.add(swimmer4);
        athleteList.add(swimmer5);
        athleteList.add(swimmer6);
        athleteList.add(swimmer7);

        athleteList.add(superAthlete1);
        athleteList.add(superAthlete2);
        athleteList.add(superAthlete3);
        athleteList.add(superAthlete4);









        getAthlete(athleteList);
        // todo
       // pass value to menu class and then return sth
//        Driver driver = new Driver(); // create new menu
//        driver.mainMenu();`

    }

//    public static void athletes(){
//        int index = (int)Math.random()*(25);
//        printEven(athleteList.get(index));
//    }

    public static void getAthlete (ArrayList Athlete){
        Random random = new Random();

        int index = random.nextInt(Athlete.size());
        System.out.println(index);
        String s = Athlete.get(index).toString();
        System.out.println(s);
    }



}

