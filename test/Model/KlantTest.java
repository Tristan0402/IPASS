package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlantTest {

    @Test
    void getStraat() {
        Klant k1 = new Klant("Achterwegen", "Utrecht", "4023KW");

        assertEquals(k1.getStraat(), "Achterwegen");
    }

    @Test
    void getWoonplaats() {
        Klant k1 = new Klant("Achterwegen", "Utrecht", "4023KW");

        assertEquals(k1.getWoonplaats(), "Utrecht");
    }

    @Test
    void getPostCode() {
        Klant k1 = new Klant("Achterwegen", "Utrecht", "4023KW");

        assertEquals(k1.getPostCode(), "4023KW");
    }

    @Test
    void getLandWithoutLand() {
        Klant k1 = new Klant("Achterwegen", "Utrecht", "4023KW");

        assertEquals(k1.getLand(), "Nederland");
    }

    @Test
    void getLand(){
        Klant k1 = new Klant("Achterwegen", "Utrecht", "4023KW", "Germany");

        assertEquals(k1.getLand(), "Germany");
    }
}