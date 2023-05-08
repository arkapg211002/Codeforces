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
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
              b[a[i]-1]=i+1;
        }
        for(int i=0;i<n;i++)
        {
              System.out.print(b[i]+" ");
        }
                
      }
}