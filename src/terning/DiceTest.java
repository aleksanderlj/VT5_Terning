package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    Dice minTest = new Dice(); //Objekt til at køre metoder fra Dice.java

    @org.junit.jupiter.api.Test
    void roll() {
        int expectedFace = 6; //Terningen skal ramme alle 6 sider på et eller andet tidspunkt
        int actualFace = 0;
        int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0;

        //Kører testen 60.000 gange for at sikre, at tilfældighed spiller en minimal rolle
        for(int i = 0;(i<=60000); i++){
            //Tester om terningen holder sig inden for værdierne 1-6
            int roll = minTest.roll();
            assertTrue(roll>0 && roll<7);

            //Tester om terningen rammer alle sider på et eller andet tidspunkt
            if (roll==1 && face1==0) {
                face1++;
                actualFace++;
            }
            if (roll==2 && face2==0) {
                face2++;
                actualFace++;
            }
            if (roll==3 && face3==0) {
                face3++;
                actualFace++;
            }
            if (roll==4 && face4==0) {
                face4++;
                actualFace++;
            }
            if (roll==5 && face5==0) {
                face5++;
                actualFace++;
            }
            if (roll==6 && face6==0) {
                face6++;
                actualFace++;
            }
        }
        assertEquals(expectedFace, actualFace);
    }

    @org.junit.jupiter.api.Test
    void rollMultiple() {
    }
}