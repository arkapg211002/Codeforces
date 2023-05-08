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
               if(n<2020 && n<2021)System.out.println("NO");
               else if(n%2020==0 || n%2021==0)System.out.println("YES");
               else
               {
                     int f=0;
                     while(n>=2020)
                     {
                           if(n%2020==0)
                           {
                                 f=1;
                                 break;
                           }
                           n-=2021;
                     }
                     if(f==1)System.out.println("YES");
                     else System.out.println("NO");
                     
               }
               t-=1;
         }
         
           
           
      }
}