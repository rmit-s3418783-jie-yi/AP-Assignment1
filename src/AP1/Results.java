package AP1;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Results {
    private String firstPlace; // athlete ID
    private String secondPlace;
    private String thirdPlace;
    private Official official;
    private Game game;
    private ProcessResults

    public Results(String s1,String s2,String s3){
        firstPlace = s1;
        secondPlace = s2;
        thirdPlace = s3;
    }


    public Results(Game game,String firstPlace,String secondPlace,String thirdPlace, Official official) {
        this.game = game;
        this.firstPlace = firstPlace;
        this.secondPlace = secondPlace;
        this.thirdPlace = thirdPlace;
        this.official = official;
    }

    public void setWinners(ArrayList<ProcessResults> finalResult){
        firstPlace = finalResult.get(0).getAthID();
        secondPlace = finalResult.get(1).getAthID();
        thirdPlace = finalResult.get(2).getAthID();
    }

    public String getFirstPlace(){
        return firstPlace;
    }

    public String getSecondPlace() {
        return secondPlace;
    }

    public String getThirdPlace(){
        return thirdPlace;
    }

    public void setFirstPlace(String firstPlace) {
        this.firstPlace = firstPlace;
    }

    public void setSecondPlace(String secondPlace) {
        this.secondPlace = secondPlace;
    }

    public void setThirdPlace(String thirdPlace) {
        this.thirdPlace = thirdPlace;
    }


    public void setOfficial(Official official){
        this.official = official;
    }

    public Official getOfficial() {
        return official;
    }


    @Override
    public String toString() {
        return "Reference: " + official.toString() +
                "\nFirstPlace: " + firstPlace +
                "\nSecondPlace: " + secondPlace +
                "\nThirdPlace: " + thirdPlace;

    }

}