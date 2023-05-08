import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
          Scanner sc=new Scanner(System.in);
          StringBuilder s=new StringBuilder(sc.next());
          String st=sc.next();
          if(s.reverse().toString().equals(st)==true)System.out.println("YES");
          else System.out.println("NO");
                
      }
}