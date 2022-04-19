

import java.util.Scanner;

public class Onetotendowhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;

        do {

            System.out.println("Enter the number");
             number = scan.nextInt();

        } while (number>1 && number<10);
        scan.close();
        System.out.println(number +"Is out of range");

    }

}