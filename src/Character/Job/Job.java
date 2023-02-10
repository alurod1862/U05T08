package Character.Job;

import Character.Stat.Stat;

public abstract class Job {

    public abstract int modifier(Stat stat);

    public boolean equals(Object obj){
        if(getClass().getSimpleName().toString().equals(obj.getClass().getSimpleName().toString())){
            return true;
        }else {
            return false;
        }
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }






}