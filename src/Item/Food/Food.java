package Item.Food;

import Item.IConsumable;
import Character.Character;


public abstract class Food implements IConsumable{

    int power;

    public Food(int power){
        this.power = power;
    }

    public int getPower() {
        return power;

    }

    public void consumedBy(Character character) {

        if (!character.isDead()){
                character.health += this.power;
        } else {

        }
    }

}
