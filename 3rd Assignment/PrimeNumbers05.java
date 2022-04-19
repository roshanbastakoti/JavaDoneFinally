/**
 * PrimeNumbers05
 */
public class PrimeNumbers05 {

    public static boolean Checkprime(int num) {
        if (num < 2 || num == 4) {
            return false;
        } else {
            int x = num / 2;
            for (int i = 2; i < x; i++)
                if (num % i == 0) {
                    return false;

                }

            return true;
        }

    }

    public static void main(String[] args) {

        int start = 1;
        int end = 100;
        System.out.println("The prime numbers are : ");

        for (int i = start; i <= end; i++) {
            if (Checkprime(i)) {
                System.out.println(i);
            }
        }

    }
}
