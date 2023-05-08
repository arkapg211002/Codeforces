import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         int k=2;
         int d=m;
         while(m<=n)
         {
               n+=1;
               m=k*d;
               k+=1;
         }
         System.out.println(n);
         
           
           
      }
}