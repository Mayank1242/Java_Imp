package javaTpoint_Array;
import java.util.Scanner;
public class A4_Jagged_array {
public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][];
	
	int n;
	System.out.println("Enter the size to 1 to 3:");
	for(int i=0;i<3;i++) {
		n=sc.nextInt();
		arr[i]=new int[n];
		
	}
//	arr[0]=new int[1];
//	 arr[1]=new int[3];
//	 arr[2]=new int[1];

	 System.out.println("Enter the element at the jagged array"); 
	
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			 arr[i][j]=sc.nextInt();
		 }
	 }
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j] + " ");
		 }
		 System.out.println();
	 }
}
}
