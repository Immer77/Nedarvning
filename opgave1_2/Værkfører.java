package opgave1_2;

public class Værkfører extends Mekaniker{
    private int tillægPrUge;

    public Værkfører(String adresse, String navn, int år, int timelønSats,int tillægPrUge) {
        super(adresse, navn, år, timelønSats);
        this.tillægPrUge = tillægPrUge;
    }

    public int getTillægPrUge() {
        return tillægPrUge;
    }

    public void setTillægPrUge(int tillægPrUge) {
        this.tillægPrUge = tillægPrUge;
    }

    @Override
    public double beregnLoen(int timelønsats){
        return super.beregnLoen(timelønsats) + tillægPrUge;
    }
}
