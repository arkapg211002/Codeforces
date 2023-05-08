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
                  int k=sc.nextInt();
                  
                  if(k>=n)System.out.println((k-n));
                  else if(n%2==k%2)System.out.println(0);
                  else System.out.println(1);
                  t-=1;
            }
      }
}