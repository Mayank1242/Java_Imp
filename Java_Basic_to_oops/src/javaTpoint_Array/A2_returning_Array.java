package javaTpoint_Array;

public class A2_returning_Array {
	public static int[] get() {
		return new int[] {12,33,3,23,3,3,4};
	}
public static void main(String args[]) {
	int arr[]=get();
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
