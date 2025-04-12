public class VigenereCipher{
	public static void main(String[] args){
		String key = "VIGENERECIPHER";
		String message = "Hello every one! I hope you have a great day.";
		String encryptMsg = encrypt(message, key);
		String decryptMsg = decrypt(encryptMsg, key);
		System.out.println("String: "+message);
		System.out.println("Encrypted Message: "+encryptMsg);
		System.out.println("Decrypted Message: "+decryptMsg);
	}
	public static String encrypt(String text, String key){
		String res = "";
		text = text.toUpperCase();
		for(int i=0,j=0; i<text.length(); i++){
			char c = text.charAt(i);
			if(c<'A'||c>'Z'){
				continue;
			}
			res+=(char)( (c + key.charAt(j) - 2*'A' ) % 26 + 'A');
			j=++j%key.length();
		}
		return res;	
	}
	public static String decrypt(String text, String key){
		String res = "";
		text = text.toUpperCase();
		for(int i=0,j=0; i<text.length(); i++){
			char c = text.charAt(i);
			if(c<'A'||c>'Z'){
				continue;
			}
			res+=(char)( (c-key.charAt(j) + 26) % 26 + 'A');
			j=++j%key.length();
		}
		return res;
	}
}