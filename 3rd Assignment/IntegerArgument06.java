import java.util.Scanner;

/**
 * IntegerArgument06
 */
public class IntegerArgument06 {

    public static int IsSquare(int number) {
        int square = 0;
        for (int i = 1; i * i <= number; i++) {

            if (number == i * i) {

                return 1;

            }

        }

        return square;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        System.out.println(IsSquare(number));
    }

}