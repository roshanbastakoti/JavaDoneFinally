import java.util.Scanner;

public class SumAndProduct {
    double x;
    double y;

    public double ProductOfTwoNumbers(double x, double y) {

        return x * y;
    }

    public double SumOfTwoNumbers(double x, double y) {

        return x + y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        double x = scan.nextInt();

        System.out.println("Enter the number");
        double y = scan.nextInt();

        SumAndProduct A = new SumAndProduct();
        SumAndProduct B = new SumAndProduct();

        System.out.println("The product  of two numbers is " + A.ProductOfTwoNumbers(x, y));
        System.out.println(("The sum of two number is " + B.SumOfTwoNumbers(x, y)));

        scan.close();

    }

}
