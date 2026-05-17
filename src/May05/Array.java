package May05;

public class Array {
     public static void main(String[] args) {

         /// first type to create array

         int []  arr = new int[5];
         arr[0] = 1;
         arr[1] = 3;
         arr[2] = 5;
         arr[3] = 6;
         arr[4] = 7;

         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         System.out.println(arr[3]);
         System.out.println(arr[4]);
         System.out.println();

         /// 2nd type

         int [] arr2 = {1,2,3,4,5,6};

         System.out.println(arr2[0]);
         System.out.println(arr2[1]);
         System.out.println(arr2[2]);
         System.out.println(arr2[3]);
         System.out.println(arr2[4]);
         System.out.println();


         /// how to loop over the elements
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);

         }
         System.out.println();

         /// FOR EACH LOOP [for each element : array { print element }]
         for (int e : arr) {
             System.out.println(e);

         }

    }
}
