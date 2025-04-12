package logical;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int key = 7;
		int lp = 0;
		int hp = a.length-1;
		int mid = (lp + hp)/2;
		while(lp<=hp) {
			mid = (lp + hp)/2;
			if(a[mid] == key) {
				System.out.println("Element is present");
				break;
			}
			else if(key < a[mid]) {
				hp = mid - 1;
			}
			else {
				lp = mid + 1;
			}
			
		}

	}

}
