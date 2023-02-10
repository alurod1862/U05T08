package Character.Race;

import Character.Stat.Costitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

    @Test
    void testHuman() {
        Human human = new Human();
        Strength strength = new Strength(5);
        Costitution costitution = new Costitution(5);
        Dexterity dexterity = new Dexterity(5);
        assertEquals(2,human.modifier(strength));
        assertEquals(2, human.modifier(costitution));
        assertEquals(1, human.modifier(dexterity));
    }

    @Test
    void testOrc() {
        Orc orc= new Orc();
        Strength strength = new Strength(5);
        Costitution costitution = new Costitution(5);
        Intelligence intelligence = new Intelligence(5);
        assertEquals(5,orc.modifier(strength));
        assertEquals(3, orc.modifier(costitution));
        assertEquals(-3, orc.modifier(intelligence));
    }



    @Test
    void testElf() {
        Elf elf = new Elf();
        Intelligence intelligence= new Intelligence(5);
        Costitution costitution = new Costitution(5);
        Dexterity dexterity = new Dexterity(5);
        assertEquals(3,elf.modifier(intelligence));
        assertEquals(-1, elf.modifier(costitution));
        assertEquals(3, elf.modifier(dexterity));
    }


    @Test
    void testBug() {
        Bug bug = new Bug();
        Strength strength = new Strength(5);
        Costitution costitution = new Costitution(5);
        Dexterity dexterity = new Dexterity(5);
        assertEquals(3,bug.modifier(strength));
        assertEquals(3, bug.modifier(costitution));
        assertEquals(-1, bug.modifier(dexterity));
    }

    @Test
    void testSheikh() {
        Sheikh sheikh = new Sheikh();
        Intelligence intelligence= new Intelligence(5);
        Costitution costitution = new Costitution(5);
        Dexterity dexterity = new Dexterity(5);
        assertEquals(7,sheikh.modifier(intelligence));
        assertEquals(-3, sheikh.modifier(costitution));
        assertEquals(1, sheikh.modifier(dexterity));
    }


}