/**
 * Array01
 */
public class Array01 {
    public static void main(String[] args) {

        // 1D Array
        int[] arr = { 8, 9, 75, 85, 100 };
        System.out.println(arr[3]);

        // 2D Array

        int[][] myarr;
        myarr = new int[3][3];
        myarr[0][0] = 5;
        myarr[0][1] = 25;
        myarr[0][2] = 35;
        myarr[1][0] = 45;
        myarr[1][1] = 55;
        myarr[1][2] = 65;
        myarr[2][0] = 75;
        myarr[2][1] = 85;
        myarr[2][2] = 95;
        // Loop for rows
        for (int i = 0; i < 3; i++) {

            // Loop for column
            for (int j = 0; j < 3; j++) {
                System.out.print(myarr[i][j] + " ");
            }

            // line break

            System.out.println();

        }

        // Using For each loop

        for (int[] list : myarr) {
            for (int i : list) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
        String[][] myname = { { "Ram", "Krishna" }, { "Sita", "Durga" } };
        for (String[] list : myname) {
            for (String i : list) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }

}