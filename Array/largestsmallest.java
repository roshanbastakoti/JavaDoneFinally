public class largestsmallest {

    public static void main(String[] args) {

        int myArray[] = { 10, 15, 20, 30, 100, 9 };
        int largest = myArray[0];
        int sum = 0;
        int multiply = 1;
        int smallest = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > largest) {
                largest = myArray[i];
            }

        }
        
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < smallest) {
                smallest = myArray[i];
            }
        }

        for (int i=0; i<myArray.length;i++){
            sum = sum + myArray[i];

        }
        for (int i=0; i<myArray.length;i++){
            multiply = multiply * myArray[i];

        }


        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
        System.out.println("The sum of the number is "+ sum);
        System.out.println("The product of the number is "+ multiply);
        System.out.println("The average of the given array is "+ sum/myArray.length);

    }
}