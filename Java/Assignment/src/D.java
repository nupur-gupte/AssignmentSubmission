import p1.*;
/*
//DIFFERENT PACKAGE SUB CLASS
class D extends p1.A{
	public static void main(String args[]) {
		D obj = new D();
		obj.display(); // Gives Error 
		obj.displayProtected();
		obj.displayPublic();
		obj.displayPrivate();// Gives Error
	}	
}
*/


//DIFFERENT PACKAGE NON SUB CLASS
class D{
	public static void main(String args[]) {
		A obj = new A();
		//obj.display(); //Gives Error
		//obj.displayProtected(); //Gives Error
		obj.displayPublic();
		//obj.displayPrivate(); //Gives Error
	}
	
}