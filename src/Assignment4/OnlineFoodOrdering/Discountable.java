package Assignment4.OnlineFoodOrdering;

public interface Discountable {


    double applyDiscount(double percentage) throws IllegalArgumentException;

    public String getDiscountDescription();
}
