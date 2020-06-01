package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductAantalTest {

    @Test
    void getTotaalPrijs() {
        ProductAantal PA1 = new ProductAantal();

        PA1.setTotaalPrijs(10.20);
        assertEquals(PA1.getTotaalPrijs(), 10.20);
    }

    @Test
    void getAantal() {
        ProductAantal PA1 = new ProductAantal();

        PA1.setAantal(4);
        assertEquals(PA1.getAantal(), 4);
    }
}