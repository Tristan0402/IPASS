package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    private String naam;
    private LocalDate geboortedatum;
    private ArrayList bestelGeschiedenis;

    public Account(String naam, LocalDate geboortedatum){
        this.naam = naam;
        this.geboortedatum = geboortedatum;
    }

    public void setBestelGeschiedenis(ArrayList geschiedenis){
        this.bestelGeschiedenis = geschiedenis;
    }

    public String getNaam(){
        return this.naam;
    }

    public LocalDate getGeboortedatum(){
        return this.geboortedatum;
    }

    public ArrayList getBestelGeschiedenis(){
        return this.bestelGeschiedenis;
    }
}
