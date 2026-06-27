package June27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {

        Map<String,Map<Integer,String> > map = new HashMap<>();

        while (true) {
            System.out.println("Enter Student Name:");
            Scanner input1 = new Scanner(System.in);
            String name = input1.nextLine();

            System.out.println("Enter Course:");
            Scanner input2 = new Scanner(System.in);
            String course = input2.nextLine();

            if(map.containsKey(name)){}
        }





    }
}
