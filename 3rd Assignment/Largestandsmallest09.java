import java.util.Scanner;

public class Largestandsmallest09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        do {

            System.out.println("Enter the number");
            num = scan.nextInt();
            if (num == 0) {
                break;
            }
            if (num > largestNumber) {
                largestNumber = num;
            }
            if (num < smallestNumber) {
                smallestNumber = num;
            }
        } while (num != 0);

        System.out.println("The largest number is :" + largestNumber);
        System.out.println("The smallest numberr is :" + smallestNumber);

    }

}
