package p1;
/*

//SAME PACKAGE SUB CLASS

class B extends A{
	public static void main(String args[]) {
		B obj=new B();
		obj.display();
		obj.displayProtected();
		obj.displayPublic();
		obj.displayPrivate();// Gives error
	}
}
*/


//SAME PACKAGE NON SUB CLASS
class B{
	public static void main(String args[]) {
		A obj=new A();
		obj.display();
		obj.displayProtected();
		obj.displayPublic();
		//obj.displayPrivate();//Gives Error
	}
}