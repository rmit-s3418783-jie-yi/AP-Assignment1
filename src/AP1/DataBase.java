package AP1;

import java.util.ArrayList;

public class DataBase {

    public String getAthlete (ArrayList Athlete){
        int index = (int)Math.random()*(Athlete.size());
        String s = Athlete.get(index).toString();
        return s;
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    public String printEven(){
//        getAthlete();
//        return s;
//    }
}
