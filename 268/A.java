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
           for(int i=0;i<n;i++)
           {
                 a[i][0]=sc.nextInt();
                 a[i][1]=sc.nextInt();
           }
           int c=0;
           for(int i=0;i<n;i++)
           {
                 for(int j=0;j<n;j++)
                 {
                       if(a[i][0]==a[j][1] && i!=j)c+=1;
                 }
           }
           System.out.println(c);
           
      }
}