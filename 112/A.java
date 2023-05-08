import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            String a=sc.next();
            String b=sc.next();
            a=a.toLowerCase();
            b=b.toLowerCase();
            if(a.compareTo(b)<0)System.out.println(-1);
            else if(a.compareTo(b)>0)System.out.println(1);
            else System.out.println(0);
      }
}