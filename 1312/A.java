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
                  int m=sc.nextInt();
                  if(n%m==0)System.out.println("YES");
                  else System.out.println("NO");
                  t-=1;
            }
            
      }
     
      
}