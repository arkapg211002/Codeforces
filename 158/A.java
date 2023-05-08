import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                  a[i]=sc.nextInt();
            }
            int c=0;
            for(int i=0;i<n;i++)
            {
                  if(a[i]>=a[k-1] && a[i]!=0)c+=1;
            }
            System.out.println(c);
      }
}