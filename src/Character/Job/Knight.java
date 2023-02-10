package Character.Job;

import Character.Stat.Costitution;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Knight extends Job {


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 3;
        }else if(stat instanceof Costitution) {
            return 2;
        }else{
            return 0;
        }
    }


}
