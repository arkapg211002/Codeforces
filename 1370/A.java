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
                  if(n>=1 && n<=3)System.out.println(1);
                  else System.out.println(n/2);
                  t-=1;
            }
            
            
      }
      
}