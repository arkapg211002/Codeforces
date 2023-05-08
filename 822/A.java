import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            long a=sc.nextLong();
            long b=sc.nextLong();
            long m=(long)Math.min(a,b);
            long p=1;
            for(long i=2;i<=m;i++)
            {
                  p*=i;
            }
            System.out.println(p);
            
      }
      
}