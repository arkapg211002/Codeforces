import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           String p=sc.next();
           char c='\u0000';
           int f=0;
           for(int i=0;i<p.length();i++)
           {
                 c=p.charAt(i);
                 if(c=='H' || c=='Q' || c=='9')
                 {
                       f=1;
                       break;
                 }
           }
           if(f==1)System.out.println("YES");
           else System.out.println("NO");
           
           
           
      }
}