import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                  a[i]=sc.nextLong();
            }
            long max=0L,min=0L;
            System.out.println((int)Math.abs(a[0]-a[1])+" "+(int)Math.abs(a[0]-a[n-1]));
            for(int i=1;i<n-1;i++)
            {
                  min=(int)Math.min((int)Math.abs(a[i]-a[i-1]),(int)Math.abs(a[i]-a[i+1]));
                  max=(int)Math.max((int)Math.abs(a[i]-a[0]),(int)Math.abs(a[i]-a[n-1]));
                  System.out.println(min+" "+max);
            }
            System.out.println((int)Math.abs(a[n-1]-a[n-2])+" "+(int)Math.abs(a[n-1]-a[0]));
      }
}