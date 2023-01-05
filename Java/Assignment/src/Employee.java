class Emp{
	String name;
	final String PAN;//blank final variable, can only be initialized in constructor;
	static int employeeCount=0;//static variable initialized only once
	public static final String DEPARTMENT;//uninitialized static final variable, can only be initialized in static block
	private static void addEmployee() {//static method to maintain employee count
		employeeCount=employeeCount+1;
	}
	protected static int getEmployeeCount() {
		return employeeCount;
	}
	static {//static final variable, can only be initialized in static block 
		DEPARTMENT="Information Technology";
	}
	Emp(String name, String pan)//constructor
	{
		this.name=name;
		this.PAN=pan;
		Emp.addEmployee();
	}
}
public class Employee{
	public static void main(String args[]) {
		System.out.println("Initial Employee Count => "+ Emp.getEmployeeCount());//no need to create object to access static variable or call static method
		new Emp("Tina","ABTUG12345");
		System.out.println("Initial Employee Count => "+ Emp.getEmployeeCount());
		Emp emp1=new Emp("Neha","NNDSE123543");
		System.out.println(emp1.PAN+" "+emp1.DEPARTMENT+" "+Emp.employeeCount);
		//emp1.PAN="NewPANNumber12345"; //Gives error cant reassign final variable
	}
	
	
	
}