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
                  long a[]=new long[n];
                  long s=0;
                  for(int i=0;i<n;i++)
                  {
                        a[i]=sc.nextLong();
                        s+=a[i];
                  }
                  long x=s%(long)n;
                  System.out.println(x*(n-x));
                  t-=1;
            }
            
            
      }

}