package Character.Stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatTest {
    @Test
    public void testStrength() {
        Strength strength = new Strength(5);
        assertEquals(5, strength.getValue());
        strength.decrease();
        assertEquals(4, strength.getValue());
        strength.increase();
        assertEquals(5, strength.getValue());
        strength.toString();
        assertEquals("Strength", strength.toString());
    }

    @Test
    public void testIntelligence() {
        Intelligence intelligence = new Intelligence(5);
        assertEquals(5, intelligence.getValue());
        intelligence.decrease();
        assertEquals(4, intelligence.getValue());
        intelligence.increase();
        assertEquals(5, intelligence.getValue());
        intelligence.toString();
        assertEquals("Intelligence", intelligence.toString());
    }

    @Test
    public void testDexetery() {
        Dexterity dexterity = new Dexterity(5);
        assertEquals(5, dexterity.getValue());
        dexterity.decrease();
        assertEquals(4, dexterity.getValue());
        dexterity.increase();
        assertEquals(5, dexterity.getValue());
        dexterity.toString();
        assertEquals("Dexetery", dexterity.toString());
    }
    @Test
    public void testCostitution() {
        Costitution costitution = new Costitution(5);
        assertEquals(5, costitution.getValue());
        costitution.decrease();
        assertEquals(4, costitution.getValue());
        costitution.increase();
        assertEquals(5, costitution.getValue());
        costitution.toString();
        assertEquals("Costitution", costitution.toString());
    }


}



