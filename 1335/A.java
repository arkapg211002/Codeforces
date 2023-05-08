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
                 if(n==1 || n==2 || n==0)System.out.println(0);
                 else if(n%2==0)System.out.println((n/2-1));
                 else if(n%2!=0)System.out.println(n/2);
                 t-=1;
           }
           
           
      }
}