package logical;

import java.util.Scanner;

public class StockProfit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int[] a = new int[c];
		for(int i=0;i<c;i++) {
			a[i]=s.nextInt();
		}
		s.close();
		int profit=0;
		int maxProfit = 0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					profit=a[j]-a[i];
				}
				if(profit > maxProfit) {
					maxProfit=profit;
				}
			}
		}
		System.out.print(maxProfit);
	}
}
