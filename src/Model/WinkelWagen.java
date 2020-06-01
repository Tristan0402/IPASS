package Model;

public class WinkelWagen {
    private double totaalBedrag;
    private int aantalProducten;

    public WinkelWagen(){

    }

    public void  setTotaalBedrag(double bedrag){
        this.totaalBedrag = bedrag;
    }

    public void setAantalProducten(int aantal){
        this.aantalProducten = aantal;
    }

    public double getTotaalBedrag(){
        return this.totaalBedrag;
    }

    public int getAantalProducten(){
        return this.aantalProducten;
    }
}
