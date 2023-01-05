import java.util.*;
public class multithread {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag,amt;
		Account acc=new Account();
		Oper[] txn=new Oper[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter the choice\nPress 1 for DEPOSIT\nPress 0 for WITHDRAW\nYour choice: ");
			flag=sc.nextInt();
			if(flag==0) {
				System.out.print("Enter the amount to be withdrawn: ");
				amt=sc.nextInt();
				amt*=(-1);
			}
			else
			{
				System.out.print("Enter the amount to be deposited: ");
				amt=sc.nextInt();
			}
			txn[i]=new Oper(acc,amt);
		}
		for(int i=0;i<5;i++) {
			txn[i].start();
		}
	}
	

}
class Account{
	int balance;
	Account(){
		balance=2500;
	}
	synchronized void operation(int amt){
		if((balance+amt)<500)
		{
			System.out.println("\nCannot perform the operation otherwise balance will go below 500");
		}
		else
		{
			balance=balance+amt;
			if(amt>0)
				System.out.println("\nRs."+amt+" deposited successfully\nBalance : Rs."+balance);
			else
				System.out.println("\nRs."+ -amt+" withdrawn successfully\nBalance : Rs."+balance);
				
		}
		
	}
}

class Oper extends Thread{
	Account a;
	int amount;
	Oper(Account a,int x){
		this.a=a;
		amount=x;
	}
	public void run()
	{
		a.operation(amount);
	}
}