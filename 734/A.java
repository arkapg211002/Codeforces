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
           int a=0,d=0;
           for(int i=0;i<s.length();i++)
           {
                 if(s.charAt(i)=='A')a+=1;
                 else d+=1;
           }
           if(a>d)System.out.println("Anton");
           else if(d>a)System.out.println("Danik");
           else System.out.println("Friendship");
      }
}