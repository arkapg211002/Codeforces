import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            String s="0123456789";
            while(t>0)
            {
                  String p="989";
                  int n=sc.nextInt();
                  int num=(int)Math.ceil((n-2)/(1.0*10));
                  for(int i=1;i<=num;i++)
                  {
                        p+=s;
                  }
                  System.out.println(p.substring(0,n));
                  t-=1;
            }
      }
      
     
      
}