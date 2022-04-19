import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int []a = new int [10];
        int []b = new int [10];
        for (int i=0;i<a.length;i++){
            System.out.println("Enter the value of a ["+i+"]");
            a[i]=scan.nextInt();
        }

        for (int i=0;i<a.length;i++){
            System.out.print("Enter the value of a ["+i+"]");
            // a[i]=scan.nextInt();
        }
        System.out.println("");

        int j = 0;
        for (int i=b.length-1;i>=0;i--){
            b[i]=a[j];
            j++;
        }
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+",");
        }

        
    }
    
}
