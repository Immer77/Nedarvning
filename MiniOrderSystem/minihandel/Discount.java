package MiniOrderSystem.minihandel;

public class Discount {
    private double price;

    public Discount(){

    }

    /**
     * Superklasse metodes som overrides nede i de andre denne bliver kaldt hvis der ingen discount er
     * Pre: Der skal ingen discount være
     * @param price
     * @return
     */
    public double getDiscount(double price){
        return 0.0;
    }
}
