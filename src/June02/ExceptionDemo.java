package June02;

public class ExceptionDemo {
    static void main(String[] args) {
        Account account = new Account();

        String input = "1000";
        try {
            int amount = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");;
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch ( Exception e) {
            System.out.println("Exception");
        }


        /// null pointer
        /// Insufficient balance
        /// Number format exception

    }
}

class Account{
    void withdraw(int amt){
        System.out.println("withdraw");
    }
}
