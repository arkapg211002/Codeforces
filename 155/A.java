import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int a[]=new int[n];
           a[0]=sc.nextInt();
           int max=a[0];
           int min=a[0];
           int c=0;
           for(int i=1;i<n;i++)
           {
                 a[i]=sc.nextInt();
                 if(a[i]>max)
                 {
                       c+=1;
                       max=a[i];
                 }
                 if(a[i]<min)
                 {
                       c+=1;
                       min=a[i];
                 }
           }
           System.out.println(c);
           
      }
}