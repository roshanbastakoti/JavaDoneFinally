import java.util.Scanner;

public class Reverse03 {

    public static void main(String[] args) {
        int number = 0;
        int reversenumber = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        number = scan.nextInt();

        while (number != 0) {
            reversenumber = reversenumber * 10;
            reversenumber = reversenumber + number % 10;
            number = number / 10;

        }

        System.out.println(reversenumber);

    }

}
