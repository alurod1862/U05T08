package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;
import Item.IConsumable;

public class Character implements IDamageable {

    public String name;
    public Race race;
    public Job job;
    public Strength strength;
    public Intelligence intelligence;
    public Dexterity dexterity;
    public Costitution costitution;
    public double health;


    public Character(String name, Race race, Job job, Strength strength, Intelligence intelligence, Dexterity dexterity,Costitution costitution,double health) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.costitution = costitution;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public Race getRace(){
        return race;
    }
    public Job getJob(){
        return job;
    }

    public Strength getStrength(){
        return strength;
    }

    public Intelligence getIntelligence(){
        return intelligence;
    }

    public Dexterity getDexterity(){
        return dexterity;
    }

    public Costitution getCostitution(){
        return costitution;
    }

    public double getHealth(){
        return health;
    }

//puede que me de error porque esta con dexterity.value y no con dexterity.getValue
    public double velocity(Dexterity dexterity){
        return (dexterity.value + job.modifier(dexterity) + race.modifier(dexterity))* 2;
    }

    public double power(Strength strength){
        return (strength.value + job.modifier(strength) + race.modifier(strength)) * 2;
    }

    public double magic(Intelligence intelligence){
        return (intelligence.value + job.modifier(intelligence) + race.modifier(intelligence)) * 2;
    }

    @Override
    public String toString(){
        return "My name: " + name + " I'am an " +  getRace() +" "+ getJob() + " My stats are: Power: " + strength.getValue() + " Dexterity: " + dexterity.getValue() + " Intelligence: " + intelligence.getValue() + " Costitucion: " + costitution.getValue()
                + " My velocity is: " + velocity(getDexterity()) + " My power is: " + power(getStrength()) + " My magic is: " + magic(getIntelligence()) + " My Health " + getHealth();
    }
    @Override
    public double maxHealth() {
        return (costitution.getValue() + race.modifier(costitution) + job.modifier(costitution))*25;
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
        if (health <= 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String receiveDamage(double amount) {
        String salida = getName() + " received " + amount + " damage" + ". Healtl: " + (health-amount) +"/"+ maxHealth();
        health = (health-amount);
        System.out.println(salida);
        return salida;
    }

    @Override
    public String heals(double amount) {
        String salida = getName() + " healed " + amount + " life " + ".Healtl: " + (health+amount) +"/"+ maxHealth();
        System.out.println(salida);
        return salida;
    }


    //Paso 27
    public void consumes(IConsumable consumable){



    }





}