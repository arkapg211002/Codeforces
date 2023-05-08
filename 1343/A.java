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
               long n=sc.nextLong();
               for(long i=2;i<=29;i++)
               {
                     long v=(1<<i)-1;
                     if(n%v==0)
                     {
                           System.out.println(n/v);
                           break;
                     }
               }
               t-=1;
         }
         
           
           
      }
}