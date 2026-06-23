package Assignment4.OnlineFoodOrdering;

public class NonVegItem extends MenuItem implements Discountable{

    private double maxDiscount = 0.05;
    private boolean discountApplied;


    protected NonVegItem(int itemId, String itemName, double basePrice) {
        super(itemId, itemName, basePrice);
        this.maxDiscount = 0.00;
        this.discountApplied = true;
    }

    @Override
    public double applyDiscount(double percentage) throws  IllegalArgumentException {
        if (percentage < 0) {
            throw new IllegalArgumentException("Discount percentage cannot be negative : Provided = " +  percentage);
        }
        System.out.println("Veg Item ");
        System.out.println("Veg Item Maximum Discount : 5% " );
        System.out.println("Veg Item Base Price : " + getBasePrice() );
        System.out.println("Veg Item After Discount Price: " + getBasePrice()*maxDiscount );
        return  percentage;
    }

    @Override
    public String getDiscountDescription() {
        return "0.05 on All Non-Veg Items ";
    }

    @Override
    public String getCategory() {
        return "Non Veg Item";
    }
}
