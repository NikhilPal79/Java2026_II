package June02;

public class P1 {
    static void main(String[] args) {


        int [] rollNo = new int[5];
        rollNo[0] = 10;
        rollNo[1] = 20;
        rollNo[2] = 30;
        rollNo[3] = 40;
        rollNo[4] = 50;

        try {
            System.out.println(rollNo[5]);
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException");;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        finally {
            System.out.println("finally block executed  ");
        }


    }
}
