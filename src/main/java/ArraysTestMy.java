import java.util.Arrays;

public class ArraysTestMy {
    public static void main(String[] args) {
        String[] usernames = new String [3];
        usernames[0] = "ivan@mail.com";

        usernames[2] = "olya@mail.com";
        System.out.println(Arrays.toString(usernames));
        usernames[1] = "vassa@mail.com";
        System.out.println(Arrays.toString(usernames));

        int [] arrInt;
        arrInt = new int[10];
        System.out.println("arrInt = " + Arrays.toString(arrInt));

//        int[][] sudoku = new int [10][11];
       int[][] sudoku = {
               {1, 2, 3},
               {9, 0, 7},
               {5, 4, 8}
       };
    }
}
