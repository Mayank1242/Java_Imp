package javaTpoint_Array;

public class A1_Anonymous_Array {
	public static void printarray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
 public static void main(String args[]) {
	 printarray(new int[]{10,12,12,33,323,2});
 }
}
