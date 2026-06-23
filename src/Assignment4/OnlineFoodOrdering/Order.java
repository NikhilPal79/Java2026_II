package Assignment4.OnlineFoodOrdering;

import java.util.Arrays;
import java.util.Objects;

public class Order {


    private MenuItem[] array = new MenuItem[5];
    private int[] quantity = new int[5];
    private int itemCount = 0;

    public MenuItem[] getArray() {
        return array;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public int getItemCount() {
        return itemCount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "array=" + Arrays.toString(array) +
                ", quantity=" + Arrays.toString(quantity) +
                ", itemCount=" + itemCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return itemCount == order.itemCount && Objects.deepEquals(array, order.array) && Objects.deepEquals(quantity, order.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(array), Arrays.hashCode(quantity), itemCount);
    }

    void addItem(MenuItem item, int qty) throws InvalidOrderException {
        if (qty <= 0 ||  qty == 5) {
            throw new InvalidOrderException("Invalid quantity " + qty);
        }
        if (itemCount > 5) {
            throw new InvalidOrderException("Too many items");
        }

    }

    void printBill(){
        if (itemCount == 0) {
            System.out.println("No items in order");
        }
        System.out.println("Order Bill");
        System.out.println("Total quantity: " + getQuantity());
        System.out.println(" Total items : " + getItemCount());

    }


}
