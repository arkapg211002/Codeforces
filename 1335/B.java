import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            String s="abcdefghijklmnopqrstuvwxyz";
            while(t>0)
            {
                  int n=sc.nextInt();
                  int a=sc.nextInt();
                  int b=sc.nextInt();
                  int k=(int)Math.ceil(n/(1.0*b));
                  //System.out.println(k);
                  String bs=s.substring(0,b);
                  String p="";
                  for(int i=0;i<k;i++)
                  {
                        p+=bs;
                  }
                  System.out.println(p.substring(0,n));
                  t-=1;
            }
         
           
           
      }
}