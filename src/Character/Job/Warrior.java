package Character.Job;

import Character.Stat.*;

public class Warrior extends Job{

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
