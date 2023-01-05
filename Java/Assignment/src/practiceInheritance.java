class Employees{
	String name;
	int age;
	int eid;
	
	Employees(String name, int age, int eid)
	{
		this.name=name;
		this.age=age;
		this.eid=eid;
	}
	
	void displayDetails()
	{
		System.out.println("\nName: "+name+"\nAge: "+age+"\nEmployee Id: "+eid);
	}
}
class ProjectManager extends Employees{
	int salary;
	int no_of_projects_managed;
	
	ProjectManager(String name, int age, int eid, int salary, int projects)
	{
		super(name,age,eid);
		this.salary=salary;
		this.no_of_projects_managed=projects;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary: "+salary+"\nNo. of Projects Managed: "+no_of_projects_managed);
	}
}
class Developer extends Employees{
	int salary;
	
	Developer(String name, int age, int eid, int salary)
	{
		super(name,age,eid);
		this.salary=salary;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary: "+salary);
	}
}
class WebDeveloper extends Developer {
	String technologiesUsed;
	
	WebDeveloper(String name, int age, int eid, int salary, String technology)
	{
		super(name,age,eid,salary);
		this.technologiesUsed=technology;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Technologies Used: "+technologiesUsed);
	}
}

public class practiceInheritance{
	public static void main(String args[]) {
		WebDeveloper webdev1=new WebDeveloper("John",25,124,55050,"HTML, CSS, JavaScript");
		webdev1.displayDetails();
		System.out.println("Web developer is an instance of Employee: "+ String.valueOf(webdev1 instanceof Employees));
		System.out.println("Web developer is an instance of Developer: "+ String.valueOf(webdev1 instanceof Developer));
		ProjectManager pm1=new ProjectManager("Sam",33,512,58011,4);
		pm1.displayDetails();
		System.out.println("Project Manager is an instance of Employee: "+ String.valueOf(pm1 instanceof Employees));
		//System.out.println("Project Manager is an instance of Developer: "+ String.valueOf(pm1 instanceof Developer));//gives error
	}	
}