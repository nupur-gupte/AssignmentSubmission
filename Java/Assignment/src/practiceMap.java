import java.util.*;
import java.io.*;

class practiceMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String,Integer> mp=new HashMap<String,Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            mp.put(name,phone);//inserting name and phone no. in map
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(mp.get(s)!=null) {
                System.out.println(s+"="+mp.get(s));
            }
            else {
                System.out.println("Not found");
            }
		}
	}
}