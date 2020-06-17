package Model;

import java.util.ArrayList;

public class Webshop {
    private static ArrayList<Account> allAccounts = new ArrayList<>();
    private String naam;

    public Webshop(String naam){
        this.naam = naam;
    }

    public void setAllAccounts(ArrayList allAccounts) {
        this.allAccounts = allAccounts;
    }

    public static ArrayList<Account> getAllAccounts(){
        return allAccounts;
    }
}
