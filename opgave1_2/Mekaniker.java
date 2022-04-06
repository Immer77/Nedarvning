package opgave1_2;

public class Mekaniker extends Person {
    private int år;
    private int timelønSats;

    public Mekaniker(String adresse, String navn, int år, int timelønSats) {
        super(adresse, navn);
        this.timelønSats = timelønSats;
        this.år = år;
    }

    public int getÅr() {
        return år;
    }

    public void setÅr(int år) {
        this.år = år;
    }

    public int getTimelønSats() {
        return timelønSats;
    }

    public void setTimelønSats(int timelønSats) {
        this.timelønSats = timelønSats;
    }

    public double beregnLoen(int timelønSats){
        return 37.0 * timelønSats;
    }


}
