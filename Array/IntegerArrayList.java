import java.util.Scanner;
import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number");
            int num = scan.nextInt();
            scan.close();

        }
    }

}
