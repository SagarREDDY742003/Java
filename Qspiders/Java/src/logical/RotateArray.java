package logical;

import java.util.Arrays;
import java.util.Scanner;

// input : {1,2,3,4,5,6,7}
// output: {2,3,4,5,6,7,1}

public class RotateArray {
	public static void main(String[] arr) {
		int[] a = {1,2,3,4,5,6,7};
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a key value to left shift the array: ");
		int key = s.nextInt();
		for(int k = 0; k<key;k++) {
			int b = a[0];
			for(int i = 0; i<a.length-1;i++) {
				a[i] = a[i+1];
			}
			a[a.length-1] = b;
		}
		System.out.println(Arrays.toString(a));
		s.close();
	}
}