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
                  int n=sc.nextInt();
                  long x=sc.nextLong();
                  long a[]=new long[n];
                  long max=0L,s=0L;
                  for(int i=0;i<n;i++)
                  {
                        a[i]=sc.nextLong();
                        max+=(long)Math.ceil(a[i]/(1.0*x));
                        s+=a[i];
                  }
                  long min=0L;
                  if(s%x==0)min=s/x;
                  else min=(s/x)+1;
                  System.out.println(min+" "+max);
                  t-=1;
            }
      }

}