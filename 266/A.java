import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String s=sc.next();
            int c=0;
            for(int i=1;i<n;i++)
            {
                  if(s.charAt(i-1)==s.charAt(i))c+=1;
            }
            System.out.println(c);
      }
}