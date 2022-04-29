import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ArrayScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int array[][] = new int[3][3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the element of array");
                array[i][j] = scan.nextInt();

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]);

                sum = sum + array[i][j];
            }

            System.out.println();

        }

        System.out.println("The sum of an array is " + sum);

    }

}