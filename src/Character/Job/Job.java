package Character.Job;

import Character.Stat.Stat;

public abstract class Job {

    //Metodo para modificar las stats
    public abstract int modifier(Stat stat);

    //Metodo para saber si las stats son iguales
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
