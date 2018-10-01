package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    Dice minTest = new Dice(); //Objekt til at køre metoder fra Dice.java fra

    @org.junit.jupiter.api.Test
    void roll() {

        for(int i = 0;(i<=60000); i++){
            boolean expected = true;
            boolean actual = false;

            int roll = minTest.roll();
            if (roll>0 || roll<7) //Hvis terningen er en værdi fra 1-6 bliver actual true ellers forbliver den false
                actual = true;
            //System.out.println(roll);
            assertEquals(expected,actual);
        }
    }

    @org.junit.jupiter.api.Test
    void rollMultiple() {
    }
}