import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
         if(n%2!=0 && m%2!=0)System.out.println("Akshat");
         else if(n%2==0 && m%2==0)System.out.println("Malvika");
         else if(n%2==0 && m%2!=0 && n<m)System.out.println("Malvika");
         else if(n%2==0 && m%2!=0 && n>m)System.out.println("Akshat");
         else if(n%2!=0 && m%2==0 && n>m)System.out.println("Malvika");
         else if(n%2!=0 && m%2==0 && n<m)System.out.println("Akshat");
           
           
           
      }
}