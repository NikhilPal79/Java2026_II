package Assignment4.OnlineFoodOrdering2;

public abstract class MenuItem {

    private final int itemId;
    private final String itemName;
    private final double basePrice;


    protected MenuItem(int itemId, String itemName, double basePrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Base price must be greater than zero.");
        }
        this.basePrice = basePrice;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract String getCategory();

    public void displayInfo(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Base Price : " + basePrice);
        System.out.println("Category: " + getCategory());
    }
}
