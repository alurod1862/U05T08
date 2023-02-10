package Character.Race;

import Character.Stat.*;

public class Orc extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 5;
        }else if(stat instanceof Intelligence) {
            return -3;
        }else if(stat instanceof Costitution) {
            return 3;
        }else{
            return 0;
        }
    }


}
