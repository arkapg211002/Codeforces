import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         long a=0L,b=0L;
         int c=0,d=0;
         for(int i=0;i<n;i++)
         {
            a=sc.nextLong();
            if(a>=b)
            {
                  c+=1;
                  b=a;
            }
            else
            {
                  if(c>d)d=c;
                  b=a;
                  c=1;
            }
         }
         if(c>d)d=c;
         System.out.println(d);
           
           
           
      }
}