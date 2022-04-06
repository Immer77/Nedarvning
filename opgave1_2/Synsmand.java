package opgave1_2;

public class Synsmand extends Mekaniker{
    private int antalSyn;
    public Synsmand(String adresse, String navn, int år, int timelønSats, int antalSyn) {
        super(adresse, navn, år, timelønSats);
        this.antalSyn = antalSyn;
    }

    public int getAntalSyn() {
        return antalSyn;
    }

    public void setAntalSyn(int antalSyn) {
        this.antalSyn = antalSyn;
    }

    @Override
    public double beregnLoen(int timelønSats){
        return super.beregnLoen(timelønSats) + (29 * antalSyn);
    }
}
