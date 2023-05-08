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
           for(int i=0;i<n;i++)
           {
                 a[i]=sc.nextInt();
           }
           Arrays.sort(a);
           int s=Arrays.stream(a).sum();
           
           int c=0,m=0,d=n-1;
           while(s>=m && d>=0)
           {
                 m+=a[d];
                 s-=a[d];
                 d-=1;
                 c+=1;
           }
           System.out.println(c);
           
           
           
      }
}