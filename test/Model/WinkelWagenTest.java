package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinkelWagenTest {

    @Test
    void getTotaalBedrag() {
        WinkelWagen WW1 = new WinkelWagen();

        WW1.setTotaalBedrag(101.55);
        assertEquals(WW1.getTotaalBedrag(), 101.55);
    }

    @Test
    void getAantalProducten() {
        WinkelWagen WW1 = new WinkelWagen();

        WW1.setAantalProducten(23);
        assertEquals(WW1.getAantalProducten(), 23);
    }
}