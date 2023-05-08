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
                  if(n%10==9)System.out.println((n/10+1));
                  else System.out.println(n/10);
                  t-=1;
            }
            
      }
      
}