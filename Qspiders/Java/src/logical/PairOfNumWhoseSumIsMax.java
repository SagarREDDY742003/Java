package logical;

import java.util.Arrays;

public class PairOfNumWhoseSumIsMax {
	public static void main(String[] args) {
		int[] a = {10,20,5,60,80};
		
// METHOD 1	
		
		Arrays.sort(a);
		int l = a.length-1;
		System.out.println( a[l] + " + " + a[l-1] + " = " + (a[l]+a[l-1]) );

// METHOD 2
		int max2 = 0;
		int max1 = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1 = a[i];
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
		}
		System.out.println( max1 + " + " + max2 + " = " + (max1+max2) );

	}
}
