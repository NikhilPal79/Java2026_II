package June06;

import java.util.Scanner;

public class DriveMain {
    static void main(String[] args) {

        Drive drive = new Drive();
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Please enter your age: ");
            int age = sc.nextInt();
            drive.bookTest();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
