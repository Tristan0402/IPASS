package Model;

public class ProductAantal{
    private double totaalPrijs;
    private int aantal;

    public ProductAantal(){

    }

    public void setTotaalPrijs(double totaalPrijs){
        this.totaalPrijs = totaalPrijs;
    }

    public void setAantal(int aantal){
        this.aantal = aantal;
    }

    public double getTotaalPrijs(){
        return this.totaalPrijs;
    }

    public int getAantal(){
        return this.aantal;
    }
}
