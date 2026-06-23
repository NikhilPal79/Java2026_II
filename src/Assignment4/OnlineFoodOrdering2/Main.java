package Assignment4.OnlineFoodOrdering2;

public class Main {
    static void main(String[] args) {

        MenuItem[] menuItems = new MenuItem[6];
        menuItems[0] = new VegItem(01,"Garden Salad", 8.99);
        menuItems[1] = new VegItem(02,"Chole Bhature", 9.99);
        menuItems[2] = new VegItem(03,"Daal Chawal", 10.99);
        menuItems[3] = new NonVegItem(04,"Chikean Tikka", 15.99);
        menuItems[4] = new NonVegItem(05,"Lamb Curry", 14.99);
        menuItems[5] = new NonVegItem(06,"Chicken Biryani", 14.99);

        System.out.println("DISPLAY MENU ITEMS ");
        for (MenuItem e : menuItems) {
            if (e != null) {
                e.displayInfo();
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("APPLY DISCOUNTS USING DISCOUNTABLE REFERENCE");
        System.out.println();

        try {
            Discountable discountable = (Discountable) menuItems[0];
            double dicPrice1 =  discountable.applyDiscount(10.0);
            System.out.println("Final Price : $ " + dicPrice1);

            Discountable discountable2 = new VegItem(02,"Chole Bhature", 9.99);
            double dicPrice2 = discountable2.applyDiscount(10.0);
            System.out.println("Final Price : $ " + dicPrice2);

            Discountable discountable3 = new NonVegItem(06,"Chicken Biryani", 14.99);
            double dicPrice3 = discountable3.applyDiscount(5.0);
            System.out.println("Final Price : $ " + dicPrice3);


        }catch (IllegalArgumentException e){
            System.out.println("Discount Error : " + e.getMessage());
        }

        System.out.println();
        System.out.println("CREATE ORDER AND ADD ITEMS");
        System.out.println();











    }
}
