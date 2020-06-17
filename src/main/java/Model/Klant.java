package Model;

public class Klant {
    private String straat;
    private String woonplaats;
    private String postCode;
    private String land;

    public Klant(String Straat, String Woonplaats, String PostCode) {
        this.straat = Straat;
        this.woonplaats = Woonplaats;
        this.postCode = PostCode;
        this.land = "Nederland";
    }

    public Klant(String Straat, String Woonplaats, String PostCode, String Land){
        this.straat = Straat;
        this.woonplaats = Woonplaats;
        this.postCode = PostCode;
        this.land = Land;
    }

    public String getStraat(){
        return this.straat;
    }

    public String getWoonplaats(){
        return this.woonplaats;
    }

    public String getPostCode(){
        return this.postCode;
    }

    public String getLand(){
        return this.land;
    }
}