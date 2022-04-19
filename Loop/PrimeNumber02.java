import java.util.Scanner;

public class PrimeNumber02 {

    public static boolean isPrime(int a) {
        if (a < 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int primeCount(int start, int end) {

        int pcount = 0;
        for (int i = start; i <= end; i++) {
            boolean a = isPrime(i);
            if (a == true) {
                System.out.println(i);
                pcount++;
            }
        }
        return pcount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Emter the first number");
        int n1 = scan.nextInt();

        System.out.println("Emter the Last number");
        int n2 = scan.nextInt();

        if (n1 > 2) {
            System.out.println("First number must be smaller than the second number");
        }
        int a = primeCount(n1, n2);
        System.out.println("The total primes are " + a);
    }

}
