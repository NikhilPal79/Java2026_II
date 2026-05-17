package May09.Array_2D;

public class Array_2D {
    static void main(String[] args) {


        System.out.println("first way of 2-d array : ");
        int [][] marks = new int[2][2];

        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[1][0] = 30;
        marks[1][1] = 40;

        System.out.println(" second way of 2-d array : ");
        int[] [] arr = {{12,20,55},{50,30,75},{50,30,85}};

        System.out.println(" lopping on the 2-d array : ");

        /// need to declare the int j;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();

        }
        /// first loop is looping on the rows
        /// second loop is looping on the columns






    }
}
