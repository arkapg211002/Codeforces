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
           int c=0;
           while(a<=b)
           {
                 a*=3;
                 b*=2;
                 c+=1;
           }
           System.out.println(c);
      }
}