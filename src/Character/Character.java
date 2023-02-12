package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;
import Item.IConsumable;


/**
 * @author Iker Rodriguez Montava
 * @version 1.0
 */



public class Character implements IDamageable {

    public String name;
    public Race race;
    public Job job;
    public Strength strength;
    public Intelligence intelligence;
    public Dexterity dexterity;
    public Costitution costitution;
    public int health;

    /**
     *
     * @param name
     * @param race
     * @param job
     * @param strength
     * @param intelligence
     * @param dexterity
     * @param costitution
     * @param health
     */
    //Metodo para crar un personaje con todos los atributos
    public Character(String name, Race race, Job job, Strength strength, Intelligence intelligence, Dexterity dexterity,Costitution costitution,int health) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.costitution = costitution;
        this.health = health;
    }


    //Metodo para devolver el nombre
    public String getName(){
        return name;
    }

    //Metodo para devolver el raza
    public Race getRace(){
        return race;
    }

    ///Metodo para devolver el trabajo
    public Job getJob(){
        return job;
    }

    //Metodo para devolver la fuerza
    public Strength getStrength(){
        return strength;
    }

    //Metodo para devolver la inteligencia
    public Intelligence getIntelligence(){
        return intelligence;
    }

    //Metodo para devolver la destreza
    public Dexterity getDexterity(){
        return dexterity;
    }

    //Metodo para devolver la constirucion
    public Costitution getCostitution(){
        return costitution;
    }

    //Metodo para devolver la salud
    public double getHealth(){
        return health;
    }

    //Metodo para devolver la velocidad
    public double velocity(Dexterity dexterity){
        return (dexterity.value + job.modifier(dexterity) + race.modifier(dexterity))* 2;
    }

    //Metodo para devolver el poder
    public double power(Strength strength){
        return (strength.value + job.modifier(strength) + race.modifier(strength)) * 2;
    }

    //Metodo para devolver la magia
    public double magic(Intelligence intelligence){
        return (intelligence.value + job.modifier(intelligence) + race.modifier(intelligence)) * 2;
    }

    //Metodo para devolver todas las stats,nombre,trabajo y salud
    @Override
    public String toString(){

        String salida = "My name: " + name + " I'am an " +  getRace() +" "+ getJob() + " My stats are: Power: " + strength.getValue() + " Dexterity: " + dexterity.getValue() + " Intelligence: " + intelligence.getValue() + " Costitucion: " + costitution.getValue()
                + " My velocity is: " + velocity(getDexterity()) + " My power is: " + power(getStrength()) + " My magic is: " + magic(getIntelligence()) + " My Health " + getHealth();
        System.out.println(salida);
        return salida;
    }

    //Metodo para saber la salud total
    @Override
    public double maxHealth() {
        return (costitution.getValue() + race.modifier(costitution) + job.modifier(costitution))*25;
    }


    //Metodo para saber la salud actual
    @Override
    public double health() {
        return health;
    }


    //Metodo para saber si el personaje esta vivo
    @Override
    public boolean isDead() {
        if (health <= 0) {
            return true;
        }else {
            return false;
        }
    }

    //Metodo para saber el daño recibido
    @Override
    public String receiveDamage(int amount) {
        String salida = getName() + " received " + amount + " damage" + ". Healtl: " + (health-amount) +"/"+ maxHealth();
        health = health-amount;
        System.out.println(salida);
        return salida;
    }

    //Para autocurarse
    @Override
    public String heals(int amount) {
        String salida = getName() + " healed " + amount + " life " + ".Healtl: " + (health+amount) +"/"+ maxHealth();
        System.out.println(salida);
        health = health+amount;
        return salida;
    }


    //Metodo para consumir comida
    public String consumes(IConsumable consumable) {
        String salida = this.name + " consumed: " + consumable.getClass().getSimpleName();
        System.out.println(salida);
        return salida;
    }


    //Metodo para consumir pociones
    public String consumesPotion(IConsumable consumable) {
        String salida = this.name + " consumed: " + consumable.getClass().getSimpleName() + " Potion";
        System.out.println(salida);
        return salida;
    }



    //Metodo para curse
    @Override
    public String cure(int amount) {
        String salida = getName() + " healed " + amount + " life " + ".Healtl: " + (health+amount) +"/"+ maxHealth();
        System.out.println(salida);
        health = health+amount;
        return salida;
    }


}