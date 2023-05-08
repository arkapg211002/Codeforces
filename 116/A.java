import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int a[][]=new int[n][2];
           int c=0,d=0;
           for(int i=0;i<n;i++)
           {
                 a[i][0]=sc.nextInt();
                 a[i][1]=sc.nextInt();
                 c=c-a[i][0]+a[i][1];
                 
                 if(c>d)d=c;
                 
           }
           System.out.println(d);
           
      }
}