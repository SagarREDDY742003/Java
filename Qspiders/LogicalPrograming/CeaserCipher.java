import java.io.*;
import java.util.*;
public class CeaserCipher{
	//static Scanner sc = new Scanner(System.in);
	//static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Enter a Key: ");
		int key = sc.nextInt();
		String encrypted = encrypt(str,key);
		System.out.println("encrypted string is: "+encrypted);
		String decrypted = decrypt(encrypted,key);
		System.out.println("decrypted string is: "+decrypted);
	}
	public static String encrypt(String str,int key){
		String encrypted = "";
		for(int i=0;i<str.length();i++){
			int c = str.charAt(i);
			if(Character.isUpperCase(c)){
				c=c+(key%26);
				if(c>'Z')
				  c=c-26;
			}
			else if(Character.isLowerCase(c)){
				c=c+(key%26);
				if(c>'z')
				  c=c-26;
			}
			encrypted+=(char)c;
		}
		return encrypted;
	}
	public static String decrypt(String str,int key){
		String decrypted = "";
		for(int i=0;i<str.length();i++){
			int c = str.charAt(i);
			if(Character.isUpperCase(c)){
				c=c-(key%26);
				if(c<'A')
				  c=c+26;
			}
			else if(Character.isLowerCase(c)){
				c=c-(key%26);
				if(c<'a')
				  c=c+26;
			}
			decrypted+=(char)c;
		}
		return decrypted;
	}
}