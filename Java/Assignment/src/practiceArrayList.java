import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class practiceArrayList {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n,d,q,ele,x,y;
        n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr =new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            d=sc.nextInt();
            if(d>0)
            {
                ArrayList<Integer> temp= new ArrayList<Integer>();
                for(int j=0;j<d;j++)
                {
                    ele=sc.nextInt();
                    temp.add(ele);
                }
                arr.add(temp);
            }
            else
            {
                arr.add(null);
            }
        }
        q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            if(x<=arr.size() && arr.get(x-1)!=null && y<=arr.get(x-1).size()) {
                System.out.println(arr.get(x-1).get(y-1));
            }
            else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
        
        
        
    }
}
