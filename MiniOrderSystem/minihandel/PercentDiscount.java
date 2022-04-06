package MiniOrderSystem.minihandel;

public class PercentDiscount extends Discount{
    private int discountPercentage;


    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /**
     * Override getDiscount i Superklassen Discount
     * og regner ud med procent hvor meget der skal spares
     * Vi laver udregningerne til rabatten hernede i klasserne og bruger dem til totalbuyWithDiscount metoden i customer
     * @param price
     * @return
     */
    @Override
    public double getDiscount(double price){
        return price/100 * discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
