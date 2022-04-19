import java.util.Scanner;

public class Greatestnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number");
        int x = scan.nextInt();
       
        System.out.println("Enter the number");
        int y = scan.nextInt();

        if (x>y) {
        
        System.out.println(x + "is a greater number");
            
        }
        else {

            System.out.println(y+ "is a greater number");
        }
        scan.close();
        
    }

}
