//network security algorithms diffie-hellman key exchange algorithm
import java.io.*;
import java.math.BigInteger;
class DiffieHellman{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Prime Number: ");
		BigInteger p = new BigInteger(br.readLine());

		System.out.println("Enter Primitive root of "+p+" : ");
		BigInteger g = new BigInteger(br.readLine());

		System.out.println("Enter value for x less than "+p+" : ");
		BigInteger x = new BigInteger(br.readLine());

		BigInteger R1 = g.modPow(x,p);
		System.out.println("R1= "+R1);

		System.out.println("Enter value for y less than "+p+" : ");
		BigInteger y = new BigInteger(br.readLine());

		BigInteger R2 = g.modPow(y,p);
		System.out.println("R2= "+R2);

		BigInteger K1 = R2.modPow(x,p);
		System.out.println("Key calculated at Alice side: "+K1);

		BigInteger K2 = R2.modPow(y,p);
		System.out.println("Key calculated at Bob side: "+K2);

		System.out.println("Diffie Hellman key Encryptinhas taken");
	}
}