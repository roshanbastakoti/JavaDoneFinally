import java.util.Scanner;

public class UserInput01{
            public static void main(String[] args) {
                Scanner S = new Scanner(System.in);
                int[] arr = new int[10]; // install the array
                boolean present = false; // putting flag condition
                for (int i = 0; i < arr.length; i++) { // taking values
                    System.out.println("Enter number");
                    arr[i] = S.nextInt();
                }
                System.out.println("Enter number to check ");
                int number = S.nextInt(); // taking values of checking
                for (int i : arr) {// for all element in array/array tail.
                    if (i == number)
                        present = true;
    
                }
                System.out.println(present); // Output the value is True or False
    
            }
    
        }
    

