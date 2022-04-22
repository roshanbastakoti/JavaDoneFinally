import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//Create a method with an array argument and find the maximum and minimum value in that array.
public class arrayargument {

    public static void printall(int arr[]) {
        for (int i : arr) {
            System.out.println(i);

        }
    }

    public static void minmax(int arr[]) {
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);

    }
    public static void sum(int arr[]){
        int sum = 0;
        for (int i=0; i<arr.length;i++){
            sum = sum + arr[i];

    }
    System.out.println("The sum of the  array is " + sum);

}
public static void sortelements(ArrayList<Integer>myarraylist){
    System.out.println("Initial array list"+ myarraylist);
    Collections.sort (myarraylist);
    System.out.println("Sorted arraylist"+ myarraylist);
}

    public static void main(String[] args) {
        int a[] = { 8, 9, 10, 5, 100, 1, 57, 32 };
        printall(a);
        minmax(a);
        sum(a);
        ArrayList<Integer>myarrayList = new ArrayList<>();
        myarrayList.add(1);
        myarrayList.add(2);
        myarrayList.add(3);
        myarrayList.add(4);
        sortelements(myarrayList);

        
    }

}
