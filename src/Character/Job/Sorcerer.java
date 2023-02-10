package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;

public class Sorcerer extends Job {


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 3;
        } else if (stat instanceof Dexterity) {
            return 2;
        } else {
            return 0;
        }
    }
}
