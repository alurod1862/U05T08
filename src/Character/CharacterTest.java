package Character;

import Character.Job.Job;
import Character.Job.Knight;
import Character.Race.Human;
import Character.Race.Race;
import Character.Stat.*;
import Item.Food.*;
import Item.Potion.Healing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    //Test para Job,Stat,Race,Food,Potion
    @Test
    void test() {
        String name = "Rodolfo";
        Human human = new Human();
        Race race = human;
        Knight knight = new Knight();
        Job job = knight;
        Strength strength = new Strength(5);
        Intelligence intelligence = new Intelligence(5);
        Dexterity dexterity = new Dexterity(5);
        Costitution costitution = new Costitution(5);
        int health = 225;
        Apple apple = new Apple(10);
        Healing healing = new Healing(50);
        Character character = new Character(name,race,job,strength,intelligence,dexterity,costitution,health);
        assertEquals("Rodolfo",character.getName());
        assertEquals(race,character.getRace());
        assertEquals(job,character.getJob());
        assertEquals(strength,character.getStrength());
        assertEquals(intelligence,character.getIntelligence());
        assertEquals(dexterity,character.getDexterity());
        assertEquals(costitution,character.getCostitution());
        assertEquals(health,character.getHealth());//Falta cambiar todo lo rojo por los datos esperados
        assertEquals("My name: Rodolfo I'am an Human Knight My stats are: Power: 5 Dexterity: 5 Intelligence: 5 Costitucion: 5 My velocity is: 12.0 My power is: 20.0 My magic is: 10.0 My Health 225.0",character.toString());
        assertEquals(225,character.maxHealth());
        assertEquals(225,character.health());
        assertEquals(false,character.isDead());
        assertEquals("Rodolfo received 10 damage. Healtl: 215/225.0",character.receiveDamage(10));
        assertEquals("Rodolfo healed 5 life .Healtl: 220/225.0",character.heals(5));
        assertEquals("Rodolfo consumed: Apple",character.consumes(apple));
        assertEquals(10,apple.getPower());
        assertEquals("Rodolfo healed 10 life .Healtl: 230/225.0",character.cure(10));
        assertEquals("Rodolfo consumed: Healing Potion",character.consumesPotion(healing));
        assertEquals(50,healing.getPower());
        assertEquals("Rodolfo healed 50 life .Healtl: 280/225.0",character.cure(50));

    }


}