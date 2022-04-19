import java.util.Scanner;

/**
 * Oddeven
 */
public class Oddeven {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number");
        int x = scan.nextInt();

        if (x%2==0){

            System.out.println(x + "is an even number");

        }
        else {

            System.out.println(x + " is an odd number");
        }
        
        scan.close();

    }
}