package opgave1_2;

public class Person {
    private String navn;
    private String adresse;

    public Person(String adresse, String navn){
        this.adresse = adresse;
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
