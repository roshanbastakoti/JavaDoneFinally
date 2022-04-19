import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks obtained");
        int x = scan.nextInt();
        scan.close();

        if (x < 25) {
            System.out.println("Your grade is F");
        }

        else if (x >= 25 && x < 45) {
            System.out.println("Your grade is E");
        } else if (x >= 45 && x < 50) {
            System.out.println("Your grade is D");
        } else if (x >= 50 && x < 60) {
            System.out.println("Your grade is C");
        } else if (x >= 60 && x <= 80) {
            System.out.println("Your grade is B");
        } else {
            System.out.println("Your grade is A");
        }
    }
}
