class Person {
	//private fields
	private String name;
	private int age;
	private String PANnumber;
	
	
	//public setter and getter methods
	public void setName(String s) {
		name=s;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setPAN(String pan) {
		PANnumber=pan;
	}
	public String getPAN() {
		return PANnumber;
	}
}
public class practiceEncapsulation {
	public static void main(String args[]) {
		Person p=new Person();
		p.setName("Harry");
		p.setAge(34);
		p.setPAN("HWHRH543268");
		System.out.println("Name: "+p.getName()+"\nAge: "+p.getAge()+"\nPAN Number: "+p.getPAN());//accessing private instance variables using setters and getters
	}

}
