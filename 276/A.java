import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            long k=sc.nextLong();
            long f=0L;
            long t=0L;
            long max=Long.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                  f=sc.nextLong();
                  t=sc.nextLong();
                  if(t>k)f=f-(t-k);
                  max=(Long)Math.max(max,f);
                  
            }
            System.out.println(max);
            
      }
      
     
      
}