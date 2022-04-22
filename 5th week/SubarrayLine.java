import java.util.*;
public class SubarrayLine {
    static int[] subArr;
	static int[] arr;
	public static boolean checkArr(int arr[], int sub[]) {
		for(int i=0;i<sub.length;i++) { 
			if(sub[i]!=arr[i+3]) {
				return false;
			}
		}return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {10,12,20,30,25,40,32,31,35,50,60};
		int[] sub = Arrays.copyOfRange(arr,3,9);
		System.out.println("Array is : ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"  ");
	}
		System.out.print("\n");
		System.out.println("SubArray is : ");
		for(int i = 0; i < sub.length; i++){
			System.out.print(sub[i]+" ");
	}
		
		System.out.println("\n");
		if(checkArr(arr,sub)) {
			System.out.println("the subarray lies in the array");
		}else {
			System.out.println("the subarray doesnot lie in the array");
	}
	
	
}
}
