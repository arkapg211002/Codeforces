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
                  if(n%2!=0)n+=1;
                  if(n<=6)System.out.println(15);
                  else System.out.println((n*5)/2);
                  
                  
                  t-=1;
            }
      }
      
     
      
}