package Assignment4.OnlineFoodOrdering;

public class VegItem extends MenuItem implements Discountable{

    private double maxDiscount = 0.10;
    private boolean discountApplied ;


    public VegItem(int itemId, String itemName, double basePrice) {
        super(itemId, itemName, basePrice);
        this.maxDiscount = 0.00;
        this.discountApplied = true;
    }

    @Override
    public double applyDiscount(double percentage) throws IllegalArgumentException {
        if (percentage < 0) {
            throw new IllegalArgumentException("Discount percent cannot be negative : Provided = " + percentage);
        }
        System.out.println("Veg Item ");
        System.out.println("Veg Item Maximum Discount : 10% " );
        System.out.println("Veg Item Base Price : " + getBasePrice() );
        System.out.println("Veg Item After Discount Price: " + getBasePrice()*maxDiscount );
        return percentage;
    }

    @Override
    public String getDiscountDescription() {
        return "10% on All Veg Items";
    }

    @Override
    public String getCategory() {
        return "Veg Item";
    }
}
