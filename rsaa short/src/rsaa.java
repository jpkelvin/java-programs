import java.util.*;
import java.math.*;
public class rsaa {
	static BigInteger p,q,phi,n,e,d;
	public static void main(String[] args) {
		String s;
		rsaa rsa =new rsaa();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a plain text");
		s=in.nextLine();
		System.out.println("Encrypting String "+s);
		System.out.println("string in bytes "+bytesToString(s.getBytes()));
		byte encrypted[] = rsa.encrypt(s.getBytes());
		byte decrypted[] = rsa.decrypt(encrypted);
		System.out.println("Decrypting Bytes "+bytesToString(decrypted));
		System.out.println("Decrypted string is " + new String(decrypted));
		in.close();
	}
	public rsaa(){
		Random r=new Random();
		int bitLength=1024;
		p=BigInteger.probablePrime(bitLength, r);
		q=BigInteger.probablePrime(bitLength, r);
		n=p.multiply(q);
		phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		e=BigInteger.probablePrime(bitLength/2, r);
		while(phi.gcd(e).compareTo(BigInteger.ONE)>0&& e.compareTo(phi)<0)
			e.add(BigInteger.ONE);
		d=e.modInverse(phi);
			
	}
	private byte[] decrypt(byte[] message) {
		return(new BigInteger(message)).modPow(e, n).toByteArray();
	}
	private byte[] encrypt(byte[] message) {
		return(new BigInteger(message)).modPow(d, n).toByteArray();
	}
	private static String bytesToString(byte[] encrypted) {
		String a = " ";
		for(byte b: encrypted)
			a +=Byte.toString(b);
		return a;
	}

}
