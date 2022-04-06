package opgave1_2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Værkfører værkfører = new Værkfører("Sønderhøj 30","Bent",2019,120,300);
        Mekaniker mekaniker = new Mekaniker("Kaj", "Peter",2019,120);
        Synsmand synsmand = new Synsmand("Sønderhøj 31", "Katja",2019,120,15);

        ArrayList<Mekaniker> mekanikers = new ArrayList<>();
        mekanikers.add(værkfører);
        mekanikers.add(mekaniker);
        mekanikers.add(synsmand);

        System.out.println(samletLoen(mekanikers));

    }

    public static double samletLoen(ArrayList<Mekaniker> mekanikers){
        double result = 0;
        for (Mekaniker m : mekanikers){
            result += m.beregnLoen(m.getTimelønSats());
        }
        return result;
    }
}
