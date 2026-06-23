package Assignment4.OnlineFoodOrdering2;

public class InvalidOrderException extends Exception {


    public InvalidOrderException(String itemId) {
        super("OrderNotValid : " + itemId + " not found in menu");
    }

    /// Constructor for quantity validation

    public InvalidOrderException(int quantity) {
        super("OrderNotValid : Qty can not be -ve & Empty " + quantity);
    }

    ///  Constructor for order full validation
    public InvalidOrderException() {
        super("Order is full : Maximum 5 items are allowed ");
    }


}
