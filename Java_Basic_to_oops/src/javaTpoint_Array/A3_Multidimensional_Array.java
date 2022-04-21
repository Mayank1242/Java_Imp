package javaTpoint_Array;
import java.util.*;
public class A3_Multidimensional_Array {
public static void main(String args[]) {
	int arr[][]= {{1,2,3},{2,4,5},{6,7,8}};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}

	
	//For user input
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the coloum size");
	int n=sc.nextInt();
	System.out.println("enter the row size");
	int m=sc.nextInt();
	int arr1[][]=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
		arr1[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	System.out.println("Your array is:");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr1[i][j] + " ");
		}
		System.out.println();
	}
}


}
