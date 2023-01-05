import java.io.*;
class FileReading {
	public static void main(String args[]) throws IOException {
		int ch;
		FileReader fr=null;
		try {
			fr=new FileReader("output.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		while((ch=fr.read())!=-1) { //reading character till end of the file
			System.out.print((char)ch);
		}
	}
}