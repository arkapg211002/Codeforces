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
         int a[]=new int[m];
         for(int i=0;i<m;i++)
         {
               a[i]=sc.nextInt();
               
         }
         Arrays.sort(a);
         int min=Integer.MAX_VALUE;
         for(int i=n-1;i<m;i++)
         {
               
               if(a[i]-a[i-(n-1)]<min)min=a[i]-a[i-(n-1)];
         }
         System.out.println(min);
           
           
           
      }
}