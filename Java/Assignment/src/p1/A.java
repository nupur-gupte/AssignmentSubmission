package p1;
public class A{
	private void displayPrivate() {
		System.out.println("Hello, I am private method in public class A");
	}
	public void displayPublic() {
		System.out.println("Hello, I am public method in public class A");
	}
	protected void displayProtected() {
		System.out.println("Hello, I am protected method in public class A");
	}
	void display() {
		System.out.println("Hello, I am default method in public class A");
	}
}