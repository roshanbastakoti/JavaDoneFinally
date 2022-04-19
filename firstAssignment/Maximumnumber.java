import java.util.Scanner;

public class Maximumnumber {
    int x, y, z;

    public int GreatestNumber(int x, int y, int z) {

        if (x > y && x > z) {
            return x;

        }

        else if (y > x && y > z) {

            return y;
        }

        else {
            return z;
        }

    }

    public int SmallestNumber(int x, int y, int z) {

        if (x < y && x < z) {
            return x;
        }

        else if (y < x && y < z) {
            return y;

        }

        else {
            return z;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = scan.nextInt();

        System.out.println("Enter the second number");
        int y = scan.nextInt();

        System.out.println("Enter third the number");
        int z = scan.nextInt();
        scan.close();

        Maximumnumber A = new Maximumnumber();
        Maximumnumber B = new Maximumnumber();

        System.out.println("The max number is " + A.GreatestNumber(x, y, z));
        System.out.println("The min number is " + B.SmallestNumber(x, y, z));

    }

}
