package Model;

public class Product {
    private String naam;
    private double prijs;

    public Product(String naam, double prijs){
        this.naam = naam;
        this.prijs = prijs;
    }

    public void setPrijs(double nieuwePrijs){
        this.prijs = nieuwePrijs;
    }

    public double getPrijs(){
        return this.prijs;
    }

    public String getNaam(){
        return this.naam;
    }
}
