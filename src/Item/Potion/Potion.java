package Item.Potion;

import Item.IConsumable;
import Character.Character;


public abstract class Potion implements IConsumable{

    //Variable para el valor de la pocion
    int power;

    //Constructor
    public Potion(int power){
        this.power = power;
    }

    //Metodo para obtener el valor
    public int getPower() {
        return power;

    }
    //Metodo para curarse
    public void consumedBy(Character character) {

        if (!character.isDead()){
            character.health += this.power;
        } else {

        }
    }

}
