import java.io.*;
public class basics{
	public static void main(String args[]) {
		Student s1 = new Student("Ayesha","2019140027",21,77.5f,79.0f,91.75f,85.35f); //object
		System.out.println("Student Name: "+ s1.name + "\n PCM Marks: "+ s1.getpcmMarks()+"\n PCB Marks: "+s1.getpcbMarks());
	}
}