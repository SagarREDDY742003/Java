package forEach;

import java.util.function.Consumer;

public class Demo2 {
	
	public static void main(String[] args) {
		Consumer<Integer> cons = t -> {
				int rev=0;
				while(t>0) {
					rev=(t%10)+rev*10;
					t/=10;
				}
				System.out.println(rev);
		};
		
		int num = 23453;
		cons.accept(num);

	}

}
