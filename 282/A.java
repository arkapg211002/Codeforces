import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int x=0;
            while(n>0)
            {
                  String s=sc.next();
                  if(s.charAt(0)=='+' && s.charAt(1)=='+')++x;
                  else if(s.charAt(0)=='-' && s.charAt(1)=='-')--x;
                  else if(s.charAt(2)=='+' && s.charAt(1)=='+')x++;
                  else if(s.charAt(2)=='-' && s.charAt(1)=='-')x--;
                  n-=1;
            }
            System.out.println(x);
      }
}