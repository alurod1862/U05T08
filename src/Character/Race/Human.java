package Character.Race;

import Character.Stat.Dexterity;
import Character.Stat.Costitution;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Human  extends Race{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 2;
        }else if(stat instanceof Dexterity) {
            return 1;
        }else if(stat instanceof Costitution) {
            return 2;
        }else{
            return 0;
        }
    }
}
