package Character.Race;

import Character.Stat.*;

public class Elf extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 3;
        }else if(stat instanceof Dexterity) {
            return 3;
        }else if(stat instanceof Costitution) {
            return -1;
        }else{
            return 0;
        }
    }


}
