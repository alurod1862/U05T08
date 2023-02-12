package Item.Food;

import Item.IConsumable;
import Character.Character;


public abstract class Food implements IConsumable{

    //Variable para el valor de la comida
    int power;

    //Constructor
    public Food(int power){
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
