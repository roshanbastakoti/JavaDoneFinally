public class IndexNumber {
    public static void main(String[] args) {

        int num[] = new int[]{12,211,332,89,77,-6,1,9,2};
        int smallest = num[0];
        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
         if (num[i] > largest)
          largest = num[i];
         
         else if (num[i] < smallest)
          smallest = num[i];
        }
        System.out.println("Largest Number is : " + largest);
        
        System.out.println("Smallest Number is : " + smallest);
       }
  
}
