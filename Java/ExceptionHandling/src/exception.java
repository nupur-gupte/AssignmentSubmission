import java.util.*;
class LowAverageException extends Exception {
	LowAverageException(String s){
		super(s);
	}
}
public class exception {
	void stats(Cricketer player[])throws LowAverageException { //throws is used to postpone the handling of a checked exception
		float avgall=(float) 0.0;
		for(int i=0;i<11;i++) {
			avgall=avgall+player[i].batting_avg;
		}
		avgall=avgall/11;
		
		Cricketer temp=new Cricketer("temp",0,0,0);
		for(int i=0;i<11;i++) {
			for(int j=i;j<11;j++) {
				if(player[i].batting_avg>player[j].batting_avg) {
					temp=player[i];
					player[i]=player[j];
					player[j]=temp;
				}
			}
		}
		for(int i=0;i<11;i++) {
			System.out.println("Name: "+player[i].player_name+"\tRuns_hit: "+player[i].runs_hit+"\tinnings_count: "+player[i].innings_count+"\tnot_out_count: "+player[i].not_out_count+"\tbatting_avg: "+player[i].batting_avg);
		}
		System.out.println("__________________________________________________________________");
		if(avgall<20)
		{
			throw new LowAverageException("entire team's batting average less than 20 runs");//throw is used to invoke an exception explicitly
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Cricketer[] player=new Cricketer[11];
		exception except=new exception();
		String name;
		int r,n;
		int inn;
		for(int i=0;i<=11;i++) {
			while(true) {
				try {
					System.out.print("Enter the name of player "+i+" ");
					name=s.next();
					System.out.print("Enter the number of runs_hit by player "+i+" ");
					r=Integer.parseInt(s.next());
					System.out.print("Enter the number of innings played by player "+i+" ");
					inn=Integer.parseInt(s.next());
					System.out.print("Enter the not_out_count for player "+i+" ");
					n=s.nextInt();
					player[i]=new Cricketer(name,r,inn,n);
					break;
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
					break;
				}
				catch(InputMismatchException e) {
					System.out.println(e);
				}
				catch(NumberFormatException e) {
					System.out.println(e);
				}
				finally {
					System.out.println("__________________________________________________________________");
				}
			}
		}
		try {
		except.stats(player);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
class Cricketer {
	String player_name;
	int runs_hit;
	int innings_count;
	int not_out_count;
	float batting_avg;
	Cricketer(String n,int r,int i,int nc){
		player_name=n;
		runs_hit=r;
		innings_count=i;
		not_out_count=nc;
		try{
			batting_avg=(runs_hit+not_out_count)/(innings_count);
		}
		catch(ArithmeticException e){
			batting_avg=0;
			System.out.println(e);
		}
	}
	float getavg() {
		return batting_avg;
	}
}
