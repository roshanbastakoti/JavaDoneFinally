import java.util.Scanner;

public class powerloop {
    public static int power (int x, int y){

        int a = 1;

        for (int i =1 ; i<=y; i++){
            a = a * x;
            

        }
        return a;

    

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the base");
        int base = scan.nextInt();
        System.out.println("Enter the power");
        int power = scan.nextInt();

        // power(a, b);
        System.out.println(power(base, power));


        




        

        }
        
    }

    
