package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void setPrijs() {
        Product P1 = new Product("Melk 1L", 2.80);

        P1.setPrijs(3.00);
        assertEquals(P1.getPrijs(), 3.00);
    }

    @Test
    void getPrijs(){
        Product P1 = new Product("Melk 1L", 2.80);

        assertEquals(P1.getPrijs(), 2.80);
    }

    @Test
    void getNaam(){
        Product P1 = new Product("Melk 1L", 2.80);

        assertEquals(P1.getNaam(), "Melk 1L");
    }
}