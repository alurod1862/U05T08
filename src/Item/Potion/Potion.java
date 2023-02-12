package Item.Potion;

import Item.IConsumable;
import Character.Character;


public abstract class Potion implements IConsumable{

    int power;

    public Potion(int power){
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
