import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         long n=0L;
         while(t>0)
         {
               n=sc.nextLong();
               if((n&(n-1))!=0)System.out.println("YES");
               else System.out.println("NO");
               t-=1;
         }
         
           
           
      }
}