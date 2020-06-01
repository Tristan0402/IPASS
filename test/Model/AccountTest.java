package Model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void setBestelGeschiedenis() {
    }

    @Test
    void getNaam() {
        Account Acc1 = new Account("Hans", LocalDate.now());

        assertEquals(Acc1.getNaam(), "Hans");
    }

    @Test
    void getGeboortedatum() {
        Account Acc1 = new Account("Hans", LocalDate.now());

        assertEquals(Acc1.getGeboortedatum(), LocalDate.now());
    }

    @Test
    void getBestelGeschiedenis() {
        ArrayList<String> lijst = new ArrayList<String>();
        lijst.add(0, "Melk 1L");
        Account Acc1 = new Account("Hans", LocalDate.now());

        Acc1.setBestelGeschiedenis(lijst);
        assertEquals(Acc1.getBestelGeschiedenis(), lijst);
    }
}