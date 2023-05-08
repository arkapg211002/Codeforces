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
               int two=0,three=0;
               while(n%2==0L)
               {
                     
                     n/=2;
                     two+=1;
               }
               while(n%3==0L)
               {
                    
                     n/=3;;
                     three+=1;
               }
               if(n==1 && three>=two)
               {
                     System.out.println((2*three-two));
               }
               else 
                  System.out.println(-1);
            t-=1;
         }
         
           
           
      }
}