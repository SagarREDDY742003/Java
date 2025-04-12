import java.util.*;
public class RailFenceCipher{

	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		int depth;
		String plaintext,cipherText,decryptedText;
		System.out.println("Enter plain text: ");
		plaintext = sc.nextLine();
		System.out.println("Enter depth for Encryption: ");
		depth = sc.nextInt();
		cipherText = encryption(plaintext,depth);
		System.out.println("Encrypted Text is : "+cipherText);
		decryptedText = decryption(cipherText,depth);
		System.out.println("Decrypted Text is : "+decryptedText);
	}
	public static String encryption(String text, int depth)throws Exception{
		int d = depth;
		int l = text.length();
		int c = l/d;
		char mat[][]=new char[d][c];
		int k=0;
		String cipherText="";
		for(int i=0;i<d;i++){
			for(int j=0;j<c;j++){
				if(k!=l)
				  mat[j][i]=text.charAt(k++);
				else
				  mat[j][i]='X';
			}
		}
		for(int i=0;i<d;i++){
			for(int j=0;j<c;j++){
				cipherText+=mat[i][j];
			}
		}
		return cipherText;
	}
	public static String decryption(String text, int depth)throws Exception{
		int d = depth;
		int l = text.length();
		int c = l/d;
		char mat[][]=new char[d][c];
		int k=0;
		String plainText="";
		for(int i=0;i<d;i++){
			for(int j=0;j<c;j++){
				mat[i][j]=text.charAt(k++);
			}
		}
		for(int i=0;i<c;i++){
			for(int j=0;j<d;j++){
				plainText+=mat[j][i];
			}
		}
		return plainText;
	}
}