package Character.Race;

import Character.Stat.*;

public class Sheikh extends Race {


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 7;
        }else if(stat instanceof Dexterity) {
            return 1;
        }else if(stat instanceof Costitution) {
            return -3;
        }else{
            return 0;
        }
    }
}
