/* 
                                Find PIN
                                
You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN.
The three numbers input1, input2 and input3 are four digit numbers within the range >= 1000 and <=9999. 
i.e. 1000 <= input1 <= 9999 1000 <= input2 <= 9999 1000 <= input3 <= 9999
input4 is a positive integer number.
If input4 is EVEN, the PIN = (sum of even digits in input1 input2 and input3) - (sum of odd digits in input1 input2 and input3) 
If input4 is ODD, the PIN = (sum of odd digits in input1 input2 and input3) - (sum of even digits in input1 input2 and input3)

Example1 - If input4-38 (an EVEN number) and if input1 = 3521, input2=2452, input3=1352, 
then PIN = (2+2+4+2+2)-(3+5+1+5+1+3+5)= -11 

Example2 - If input4=37 (an ODD number) and if input1 = 3521, input2=2452, input3=1352, 
then PIN = (3+5+1+5+1+3+5)-(2+2+4+2+2) = 11

Assuming that the 4 numbers are passed to the given function, Complete the function to find and return the */


package logical;

public class Pin {
	
	public static void main(String[] args) {
		int input1 = 3521;
		int input2 = 2452;
		int input3 = 1352;
		int input4 = 20;
		
		int pin = findPin(input1,input2,input3,input4);
		
		System.out.println(pin);

	}

	private static int findPin(int input1, int input2, int input3, int input4) {
		int[] arr = {input1,input2,input3};
		int evenSum = 0;
		int oddSum = 0;
		for(int i=0; i<arr.length;i++) {
			int r = 0;
			while(arr[i]>0) {
				r = arr[i]%10;
				if(r%2==0)
					evenSum += r;
				else
					oddSum += r;
				arr[i] = arr[i]/10;
			}
		}
		
		if(input4 % 2 == 0) {
			return (evenSum - oddSum);
		}
		else {
			return (oddSum - evenSum);
		}
		
	}

}
