package Character.Stat;

public abstract class Stat {


    //Variable de la stat
    public int value;


    //Constructor
    public Stat(int value){
        this.value= value;
    }


    //Metodo para obtener el valor
    public int getValue(){
        return value;
    }

    //Metodo para aumentar las stats
    public void increase(){
        value++;
    }


    //Metodo para disminuir las stats
    public void decrease(){
        value--;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }


}
