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
                  long x=sc.nextLong();
                  long n=sc.nextLong();
                  long d=0L;
                  
                  if(n%4==1)d=(-1)*n;
                  else if(n%4==2)d=1;
                  else if(n%4==3)d=(n+1);
                  else d=0;
                  
                  if(x==0)System.out.println(d);
                  else if(x%2==0)System.out.println(x+d);
                  else if(x%2!=0)System.out.println(x-d);
                  t-=1;
            }
            
            
            
            
      }

}