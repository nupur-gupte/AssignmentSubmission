public class practiceStrings {
	public static void main(String args[]) {
		char[] s3;
		//2 ways of string creation
		
		//1. using new keyword
		char[] word= {'H','e','l','l','o'};
		
		//2. String literals
		String s1=new String(word);
		String s2="World";
		
		System.out.println("charAt: "+s1.charAt(2));
		System.out.println("length: "+s1.length());
		System.out.println("substring: "+s2.substring(2, 4));
		System.out.println("contains: "+s2.contains("orl"));
		System.out.println("replace: "+s1.replace('l', 'p'));
		System.out.println("concat: "+s1.concat(s2));
		System.out.println("s1 = "+s1);//s1 is still only "Hello"
		s1=s1+s2;// when we assign it to s1, it becomes "HelloWorld"
		System.out.println("s1 = "+s1);
		s3=s2.toCharArray();
		s3[0]=(char)(s3[0]+32);
		System.out.println(s3);
		System.out.println((char)('A'+32));
		
	}
}