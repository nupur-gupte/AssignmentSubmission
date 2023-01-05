import java.io.FileWriter;
import java.io.IOException;
class fileCreation{
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("output.txt");//attaching a file to FileWriter
		String sentence="I am learning about File Creation & Reading in Java";
		for(int i=0;i<sentence.length();i++)
		{
			fw.write(sentence.charAt(i));//writing sentence to a file character wise
		}
		System.out.println("Written Successfully");
		fw.close();
	}
}