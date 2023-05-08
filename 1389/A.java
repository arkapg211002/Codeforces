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
                  long l=sc.nextLong();
                  long r=sc.nextLong();
                  if(r%l==0)System.out.println(l+" "+r);
                  else 
                  {
                        long d=(r/l)*l;
                        if(l<d)System.out.println(l+" "+d);
                        else System.out.println("-1 -1");
                  }
                  t-=1;
            }
            
            
      }
      
}