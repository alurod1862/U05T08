package Item.Food;

import Item.IConsumable;

public abstract class Food implements IConsumable{

    double power;

    public Food(double power){
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    @Override
    public void consumedBy(Character character) {

        if(character.){

        }else {

        }
}
