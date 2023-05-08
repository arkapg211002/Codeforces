import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                  long a=sc.nextLong();
                  long b=sc.nextLong();
                  if(a==b){
                        System.out.println("0 0");
                        t-=1;
                        continue;
                  }
                  long max=(long)Math.max(a,b);
                  long d=(long)Math.abs(a-b);
                  long e=max/d;
                  long f=(long)Math.ceil(max/(d*1.0));
                  long d1=(long)Math.abs(max-(d*e));
                  long d2=(long)Math.abs(max-(d*f));
                  long c=(long)Math.min(d1,d2);
                  System.out.println(d+" "+c);
                  
                  t-=1;
                  
                  
            }
      }
      
     
      
}