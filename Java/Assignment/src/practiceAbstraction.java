abstract class Calculate {//abstract class cant be instantiated
	abstract int powerFunc(int a,int b);
}
class CalculatorOne extends Calculate{
	int powerFunc(int a, int b) {
		int ans=1;
		for(int i=0;i<b;i++) {
			ans=ans*a;
		}
		return ans;
	}
}

class practiceAbstraction {
	public static void main(String args[]) {
		CalculatorOne c1 = new CalculatorOne();
		
		System.out.println("CalculatorOne : "+c1.powerFunc(3, 5));
	}
}