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
        int a1=0, a2=0, a3=0, a4=0, a5=0, a6=0;

        while(a1 + a2 + a3 + a4 + a5 + a6 <= 60000) {

            int roll = minTest.roll();

            if (roll == 1) {
                a1 = a1++;
            }
            if (roll == 2) {
                a2 = a2++;
            }
            if (roll == 3) {
                a3 = a3++;
            }
            if (roll == 4) {
                a4 = a4++;
            }
            if (roll == 5) {
                a5 = a5++;
            }
            if (roll == 6) {
                a6 = a6++;
            }
        }
        System.out.println("Antal 1'ere " + a1);
        System.out.println("Antal 2'ere " + a2);
        System.out.println("Antal 3'ere " + a3);
        System.out.println("Antal 4'ere " + a4);
        System.out.println("Antal 5'ere " + a5);
        System.out.println("Antal 6'ere " + a6);
        assertTrue(a1 <= 10400 && a1  >= 9600
                && a2 <= 10400 && a2  >= 9600
                && a3 <= 10400 && a4  >= 9600
                && a4 <= 10400 && a4  >= 9600
                && a5 <= 10400 && a5  >= 9600
                && a6 <= 10400 && a6  >= 9600);

    }
}