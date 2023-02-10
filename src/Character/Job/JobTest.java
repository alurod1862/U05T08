package Character.Job;

import Character.Race.Human;
import Character.Stat.Costitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    @Test
    void testWarrior() {
        Warrior warrior= new Warrior();
        Strength strength = new Strength(5);
        Costitution costitution = new Costitution(5);
        assertEquals(3,warrior.modifier(strength));
        assertEquals(2, warrior.modifier(costitution));

    }


    @Test
    void testAssassion() {
        Assassin assassin= new Assassin();
        Strength strength = new Strength(5);
        Costitution costitution = new Costitution(5);
        Dexterity dexterity = new Dexterity(5);
        assertEquals(1,assassin.modifier(strength));
        assertEquals(1, assassin.modifier(costitution));
        assertEquals(3, assassin.modifier(dexterity));
    }


    @Test
    void testKnight() {
        Knight knight = new Knight();
        Strength strength = new Strength(5);
        Costitution costitution = new Costitution(5);
        assertEquals(3, knight.modifier(strength));
        assertEquals(2, knight.modifier(costitution));
    }


    @Test
    void testMage() {
        Mage mage = new Mage();
        Intelligence intelligence = new Intelligence(5);
        Dexterity dexterity = new Dexterity(5);
        assertEquals(4,mage.modifier(intelligence));
        assertEquals(1, mage.modifier(dexterity));
    }

    @Test
    void testSorcerer() {
        Sorcerer sorcerer =new Sorcerer();
        Intelligence intelligence = new Intelligence(5);
        Dexterity dexterity = new Dexterity(5);
        assertEquals(3,sorcerer.modifier(intelligence));
        assertEquals(2, sorcerer.modifier(dexterity));
    }


}