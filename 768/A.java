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
            int d=0;
            for(int i=1;i<n-1;i++)
            {
                  if(a[i]==a[0] || a[i]==a[n-1])d+=1;
            }
            int c=a.length-2-d;
            if(c<=0)System.out.println(0);
            else System.out.println(c);
            
            
            
      }

}