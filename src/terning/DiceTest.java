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