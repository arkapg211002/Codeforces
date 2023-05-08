import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int h=sc.nextInt();
         int a[]=new int[n];
         int c=0;
         for(int i=0;i<n;i++)
         {
               a[i]=sc.nextInt();
               if(a[i]<=h)c+=1;
               else c+=2;
         }
         System.out.println(c);
                
      }
}