import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=0,d=0;
           if(a<b)
           {
                 c=a;
                 d=(b-a)/2;
           }
           else if(b<a)
           {
                 c=b;
                 d=(a-b)/2;
           }
           else c=a;
           System.out.println(c+" "+d);
           
           
      }
}