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
           char a[][]=new char[n][m];
           int k=0;
           for(int i=0;i<n;i++)
           {
                 if(i%2==0)
                 {
                       for(int j=0;j<m;j++)
                       {
                             a[i][j]='#';
                       }
                 }
                 else if(i%2!=0 && k==0)
                 {
                       for(int j=0;j<m-1;j++)
                       {
                             a[i][j]='.';
                       }
                       a[i][m-1]='#';
                       k=1;
                 }
                 else if(i%2!=0 && k==1)
                 {
                       for(int j=1;j<m;j++)
                       {
                             a[i][j]='.';
                       }
                       a[i][0]='#';
                       k=0;
                 }
                 for(int j=0;j<m;j++)
                 {
                       System.out.print(a[i][j]);
                       
                 }
                 System.out.println();
           }
           
           
      }
}