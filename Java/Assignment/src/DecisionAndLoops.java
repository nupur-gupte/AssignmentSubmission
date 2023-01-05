class Practice{
	void prime(int a, int b) {//function to find prime numbers between 2 nos.
		int flag;
		for(int i=a;i<=b;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(i);
		}
	}
	void switchCase()//switch case
	{
		switch(2/3)
		{
			case 1: System.out.println("First case");
					break;
			case 2: System.out.println("Second Case");
					break;
			default: System.out.println("Default case");
		}
	}
	
}

class DecisionAndLoops{
	public static void main(String args[]) {
		Practice obj=new Practice();
		obj.prime(10, 40);
		obj.switchCase();
	}
}