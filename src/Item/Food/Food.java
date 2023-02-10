package Item.Food;

import Item.IConsumable;

import Character.Character;

public abstract class Food implements IConsumable{

    double power;

    public Food(double power){
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void consumedBy(Character character) {

        if (character.isDead()){

        } else {

        }
    }
}
