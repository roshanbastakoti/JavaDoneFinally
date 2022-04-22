import java.util.Scanner;

public class Ascending {
	    public static void main(String[] args) {
	        Scanner A = new Scanner(System.in);
	        System.out.println("Please Enter An number of Array");
	        int box = A.nextInt();
	        int num[] = new int[box];
	        
	        int i, j, temp;
	        
	        System.out.println("Please Enter An Array");
	        for (i = 0; i < box; i++) {
	            num[i] = A.nextInt();
	        }
	        for (i = 0; i < box; i++) {
	            for (j = i + 1; j < box; j++) {
	                if (num[i] > num[j]) {
	                    temp = num[i];
	                    num[i] = num[j];
	                    num[j] = temp;
	                }
	            }
	        }
	        System.out.println("Increasing Order:-");
	        for (j = 0; j < box; j++) {
	            System.out.print(num[j]+" ");
	        }
	        for (i = 0; i < box; i++) {
	            for (j = i + 1; j < box; j++) {
	                if (num[i] < num[j]) {
	                    temp = num[i];
	                    num[i] = num[j];
	                    num[j] = temp;
	                }
	            }
	        }System.out.println();
	        System.out.println("Decreasing Order:-");
	        for (j = 0; j < box; j++) {
	            System.out.print(num[j]+" ");
	        }
	    }
	}
