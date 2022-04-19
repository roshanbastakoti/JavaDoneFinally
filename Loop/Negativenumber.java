import java.util.Scanner;

public class Negativenumber {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        while (number > 0) {
            sum = sum + number;
            System.out.println("Enter the number");

            number = scan.nextInt();

        }

        System.out.println("Negative number");
        System.out.println("Sum "+ sum);
    }

}
