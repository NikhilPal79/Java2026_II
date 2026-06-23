package Assignment4.OnlineFoodOrdering2;

public interface Discountable {


    double applyDiscount(double percentage) throws IllegalArgumentException;

    public String getDiscountDescription();
}
