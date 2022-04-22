import java.util.Arrays;
import java.util.Scanner;
public class DeleteArray {
	    public static int findelement(int[]arr,int elem) {
	    	for(int i=0;i<arr.length;i++) {
				if(arr[i]==elem) {
					return i;
				}
			}
			return 0;
	    }
	    public static void display(int arr[],int len) {
			for(int i=0;i<len;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	    public static void shiftArray(int arr[], int deleteNum) {
			int element=findelement(arr,deleteNum);
			if(element==0) {
				System.out.println(" 'number not in array'");
				display(arr,arr.length);
			}
			else {
				for(int i=element;i<arr.length-1;i++) {
					arr[i]=arr[i+1];
				}
				display(arr,arr.length-1);
			}
			
		}
		public static void main(String[] args) {
			int[] arr= {10,20,30,40,50,60,70};
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter a element to delete");
			int deleteNum=scan.nextInt();
			shiftArray(arr, deleteNum);
		}
}


