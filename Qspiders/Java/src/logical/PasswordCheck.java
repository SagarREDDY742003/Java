package logical;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String password = s.nextLine();
		s.close();
		int res = checkPassword(password);
		if(res == 0)
			System.out.println("Invalid Password");
		else
			System.out.println("Valid Password");
	}
	
	public static int checkPassword(String pass){
		int nummber = 0;
		int capitalCharacter = 0;
		
		if(pass.charAt(0)>='0'&& pass.charAt(0)<='9') {
			return 0;
		}
		else if(pass.length()<4) {
			return 0;
		}
		else {
			for(int i=0;i<pass.length();i++) {
				if(pass.charAt(i)>='0'&& pass.charAt(i)<='9') {
					nummber++;
				}
				else if(pass.charAt(i)>='A' && pass.charAt(i)<='Z') {
					capitalCharacter++;
				}
				else if(pass.charAt(i) == ' ' || pass.charAt(i)=='/'){
					return 0;
				}
			}
			if(nummber>=1 && capitalCharacter>=1) 
				return 1;
			else 
				return 0;
		}
	}
}
