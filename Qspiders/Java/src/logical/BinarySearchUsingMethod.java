package logical;

import java.util.Arrays;

public class BinarySearchUsingMethod {

	public static void main(String[] args) {
		int[] a = {10,33,44,8,12,15,6,7,99};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int key = 7;
		int d = binarySearch(a,key);	
		if(d>=0)
			System.out.println("Element "+key+" is present at index: "+d);
		else
			System.out.println("Element "+key+" is not present");
	}
	private static int binarySearch(int[] a, int key) {
		int lp = 0;
		int hp = a.length-1;
		int mid = (lp + hp)/2;	
		while(lp<=hp) {
			mid = (lp + hp)/2;
			if(a[mid] == key) {
				break;
			}
			else if(key < a[mid]) {
				hp = mid - 1;
			}
			else {
				lp = mid + 1;
			}	
		}
		return mid;
		
	}
}
