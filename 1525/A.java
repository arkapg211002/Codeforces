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
                  int k=sc.nextInt();
                  
                  System.out.println((100/gcd(100,k)));
                  t-=1;
            }
            
      }
      public static int gcd(int a,int b)
      {
            if (a == 0)
                  return b;
            return gcd(b % a, a);
      }
      
}