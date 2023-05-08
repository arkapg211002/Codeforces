import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           long n=sc.nextLong();
           long k=sc.nextLong();
           while(k>0L)
           {
                 if(n%10!=0)n-=1;
                 else if(n%10==0)n/=10;
                 //System.out.println(n);
                 k-=1;
           }
           System.out.println(n);
      }
}