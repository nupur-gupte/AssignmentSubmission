public class DataTypes{
	public static void main(String args[])
	{
		byte a=64;
		int decimal=100;
		int octal=0144;//0 is prefix for octal
		int hexa=0x64;//0x is prefix for hexadecimal
		int binary=0b1100100;//0b is prefix for binary
		char charA='\u0061';
		String strA="\u0061";
		char charB=97;//ASCII
		float numf=12.34f;
		long uid=2019140027L;
		System.out.println(a);
		System.out.println(decimal);
		System.out.println("Octal => "+octal );
		System.out.println("Hexadecimal => "+hexa);
		System.out.println("Binary => "+binary);
		System.out.println(charA);
		System.out.println(strA);
		System.out.println(charB);
		System.out.println(numf);
		System.out.println(uid);
		System.out.println("New line character\ncarriage return\rtab\tspace\sbackspace\bDone.");
	}
}