package javaTpoint_Array;

public class A6_Clone_array {
public static void main(String args[]) {
	int arr[]= {12,4,5,4,23,13};
	System.out.print("Array is:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	
	int newarr[]=arr.clone();
	System.out.print("\nClone is Array is:");
	for(int i=0;i<newarr.length;i++) {
		System.out.print(newarr[i]+ " ");
	}
	System.out.print("\nIs arr and newarr are equal:");
	System.out.println((arr==newarr));
}
}
