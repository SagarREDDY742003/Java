package logical;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		int[] a = new int[c];
		for(int i=0;i<c;i++) {
			a[i]=s.nextInt();
		}
		s.close();
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++) {
				int b = a[i];
				a[i]=a[j];
				a[j]=b;
				j--;
		}
		System.out.println(Arrays.toString(a));

	}

}
