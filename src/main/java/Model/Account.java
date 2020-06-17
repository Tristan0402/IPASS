package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    private String naam;
    private String email;
    private LocalDate geboortedatum;
    private ArrayList bestelGeschiedenis;
    private String password;

    public Account(String naam, LocalDate geboortedatum, String email, String password){
        this.naam = naam;
        this.geboortedatum = geboortedatum;
        this.email = email;
        this.password = password;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
