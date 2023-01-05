package p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Students{
	private int id;
	private String fname;
	private double cgpa;
	public Students(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class sortingStudents implements Comparator<Students> {
    public int compare(Students a, Students b) {//compares based on cgpa, then name and then id
        if(a.getCgpa()<b.getCgpa()) return 1;
        else if(a.getCgpa()>b.getCgpa())    return -1;
        else if(a.getFname().compareTo(b.getFname())<0) return -1;
        else if(a.getFname().compareTo(b.getFname())>0) return 1;
        else if(a.getId()<b.getId()) return -1;
        else if(a.getId()>b.getId()) return 1;
        else return 0;
    }
}

public class comp
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Students> studentList = new ArrayList<Students>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Students st = new Students(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        sortingStudents sortStudentComparator=new sortingStudents();
        Collections.sort(studentList,sortStudentComparator);
      	for(Students st: studentList){
			System.out.println(st.getFname());
		}
	}
}