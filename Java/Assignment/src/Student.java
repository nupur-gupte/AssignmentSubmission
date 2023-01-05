import java.io.*;
public class Student { //student class 
	//instance variables
	String name;
	String uid;
	int age;
	float physicsMarks;
	float chemistryMarks;
	float biologyMarks;
	float mathsMarks;
	float pcmMarks;
	float pcbMarks;
	
	public Student(String name, String uid, int age, float physicsMarks, float chemistryMarks, float biologyMarks, float mathsMarks)//constructor
	{
		this.name=name;
		this.uid=uid;
		this.age=age;
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.biologyMarks=biologyMarks;
		this.mathsMarks=mathsMarks;
	}
	
	//methods
	public float getpcmMarks() {
		pcmMarks=(physicsMarks+chemistryMarks+mathsMarks)/3;
		return pcmMarks;
	}
	
	public float getpcbMarks() {
		pcbMarks=(physicsMarks+chemistryMarks+biologyMarks)/3;
		return pcbMarks;
	}
}
