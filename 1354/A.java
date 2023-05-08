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
                  long c=sc.nextLong();
                  long d=sc.nextLong();
                  if(a<=b)
                  {
                        System.out.println(b);
                        t-=1;
                        continue;
                  }
                  else if(c<=d)
                  {
                        System.out.println(-1);
                        t-=1;
                        continue;
                  }
                  long e=(long)Math.ceil((a-b)/(1.0*(c-d)));
                  System.out.println(((c*e)+b));
                  t-=1;
                  
            }
      }

}