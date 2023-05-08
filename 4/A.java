import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int c=n-2;
            if(c%2==0 && c!=0)System.out.println("YES");
            else System.out.println("NO");
      }
}