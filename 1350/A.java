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
                  long n=sc.nextLong();
                  long k=sc.nextLong();
                  if(n%2==0)System.out.println((n+(k*2)));
                  else
                  {
                        System.out.println((n+func(n)+(2*(k-1))));
                  }
                  //System.out.println(func(n));
                  t-=1;
                  
            }
      }
      public static long func(long n)
      {
            long c=0L;
            long d=n;
            for(long i=2;i<=n/2;i++)
            {
                  if(n%i==0)
                  {
                        c=i;
                        break;
                  }
                        
            }
            if(c==0L)c=d;
            return c;
      }
     
      
}