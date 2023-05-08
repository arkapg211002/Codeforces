import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String s="";int l=0;
            while(n>0)
            {
                  s=sc.next();
                  l=s.length();
                  if(l>10)
                  {
                        System.out.println(s.charAt(0)+Integer.toString(l-2)+s.charAt(l-1));
                  }
                  else
                  {
                        System.out.println(s);
                  }
                  n-=1;
                  l=0;
            }
      }
}