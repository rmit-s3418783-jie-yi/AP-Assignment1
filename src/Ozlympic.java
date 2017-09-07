/**********************************************************************************************************************
 * Author: JIE YI (Jay) && Dario
 * Purpose: The Start class that for AP-Assignment1
 * Create Date: 28/07/2017
 * Version: 1.03
 * Update Date: 11/08/2017
 *********************************************************************************************************************/

import java.util.*;

public class Ozlympic {
    // todo
    // this is the main class which control all games and may be the interface
    // Scanner input = new Scanner(System.in);
    public static void main (String[] args) throws InterruptedException {

        ArrayList<Athlete> athleteList = new ArrayList<>();
        ArrayList<Game> gameList = new ArrayList<>();
        ArrayList<Official> officialsList = new ArrayList<>();

        cyclistData(athleteList);
        runnerData(athleteList);
        swimmerData(athleteList);
        supAthleteData(athleteList);
        officialData(officialsList);
        gameType(gameList);





        //getAthlete(athleteList);
        // todo
        // pass value to menu class and then return sth
        Driver driver = new Driver(); // create new menu
        driver.mainMenu(athleteList, gameList,officialsList);

    }



    // test
    public static void getAthlete (ArrayList Athlete){
        Random random = new Random();
        // 0-6 cyclist      7-13 runner     14-20 swimmer       21-24 supAthletes
        int index = random.nextInt(Athlete.size());
        System.out.println(index);
        String s = Athlete.get(index).toString();
        System.out.println(s);
    }


    public static void cyclistData(ArrayList athleteList){
        Athlete cyclist1 = new Cyclist("C01","Dario","VIC",25);
        Athlete cyclist2 = new Cyclist("C02","Aario","VIC",36);
        Athlete cyclist3 = new Cyclist("C03","Bario","VIC",27);
        Athlete cyclist4 = new Cyclist("C04","Cario","VIC",32);
        Athlete cyclist5 = new Cyclist("C05","Eario","VIC",31);
        Athlete cyclist6 = new Cyclist("C06","Fario","VIC",22);
        Athlete cyclist7 = new Cyclist("C07","Gario","VIC",26);
        athleteList.add(cyclist1);
        athleteList.add(cyclist2);
        athleteList.add(cyclist3);
        athleteList.add(cyclist4);
        athleteList.add(cyclist5);
        athleteList.add(cyclist6);
        athleteList.add(cyclist7);
    }

    public static void runnerData(ArrayList athleteList){
        Athlete runner1 = new Runner("R01","Jay","VIC",24);
        Athlete runner2 = new Runner("R02","Aay","VIC",25);
        Athlete runner3 = new Runner("R03","Bay","VIC",27);
        Athlete runner4 = new Runner("R04","Cay","VIC",31);
        Athlete runner5 = new Runner("R05","Day","VIC",33);
        Athlete runner6 = new Runner("R06","Eay","VIC",32);
        Athlete runner7 = new Runner("R07","Fay","VIC",29);
        athleteList.add(runner1);
        athleteList.add(runner2);
        athleteList.add(runner3);
        athleteList.add(runner4);
        athleteList.add(runner5);
        athleteList.add(runner6);
        athleteList.add(runner7);
    }

    public static void swimmerData(ArrayList athleteList){
        Athlete swimmer1 = new Swimmer("S01","Vincent","VIC",23);
        Athlete swimmer2 = new Swimmer("S02","Aincent","VIC",25);
        Athlete swimmer3 = new Swimmer("S03","Bincent","VIC",28);
        Athlete swimmer4 = new Swimmer("S04","Cincent","VIC",35);
        Athlete swimmer5 = new Swimmer("S05","Dincent","VIC",25);
        Athlete swimmer6 = new Swimmer("S06","Eincent","VIC",27);
        Athlete swimmer7 = new Swimmer("S07","Fincent","VIC",26);
        athleteList.add(swimmer1);
        athleteList.add(swimmer2);
        athleteList.add(swimmer3);
        athleteList.add(swimmer4);
        athleteList.add(swimmer5);
        athleteList.add(swimmer6);
        athleteList.add(swimmer7);
    }

    public static void supAthleteData(ArrayList athleteList){
        Athlete superAthlete1 = new SuperAthlete("SA01","Maggie","VIC",33);
        Athlete superAthlete2 = new SuperAthlete("SA02","Aaggie","VIC",31);
        Athlete superAthlete3 = new SuperAthlete("SA03","Baggie","VIC",32);
        Athlete superAthlete4 = new SuperAthlete("SA04","Caggie","VIC",34);
        athleteList.add(superAthlete1);
        athleteList.add(superAthlete2);
        athleteList.add(superAthlete3);
        athleteList.add(superAthlete4);
    }

    private static void officialData(ArrayList<Official> officialsList) {
        Official official1 = new Official("OFF01","Dario");
        Official official2 = new Official("OFF02","Jay");
        Official official3 = new Official("OFF03","Vincent");
        Official official4 = new Official("OFF04","Maggie");
        officialsList.add(official1);
        officialsList.add(official2);
        officialsList.add(official3);
        officialsList.add(official4);
    }

    public static void gameType(ArrayList gameList){
        Game game1 = new Game("GCyc01", "Cycling");
        gameList.add(game1);
        Game game2 = new Game("GRun01", "Running");
        gameList.add(game2);
        Game game3 = new Game("GSwim01", "Swimming");
        gameList.add(game3);

    }
}

