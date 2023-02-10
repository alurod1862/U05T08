package Character.Job;

import Character.Stat.Costitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Assassin extends Job{


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 1;
        }else if(stat instanceof Costitution) {
            return 1;
        }else if(stat instanceof Dexterity) {
            return 3;
        }else{
            return 0;
        }
    }
}
