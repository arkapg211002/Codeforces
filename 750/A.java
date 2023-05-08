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
           int s=0;
           int t=4*60-k;
           int i;
           for(i=1;i<=n;i++)
           {
                 s+=(5*i);
                 if(s>t)break;
           }
           System.out.println((i-1));
           
           
      }
}