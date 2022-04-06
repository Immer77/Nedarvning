package MiniOrderSystem.minihandel;

public class FixedDiscount extends Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {

        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    /**
     * Pre: Hvis prisen er over discount limit så minuser vi det med det fiksede beløb discount
     * Vi laver udregningerne til rabatten hernede i klasserne og bruger dem til totalbuyWithDiscount metoden i customer
     * @param price
     * @return
     */
    @Override
    public double getDiscount(double price) {
        double result = 0.0;
        if (price >= discountLimit) {
            result = fixedDiscount;
        }
        return result;
    }

}
