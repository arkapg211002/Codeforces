import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            long a[]=new long[n];
            int e=0,od=0;
            for(int i=0;i<n;i++)
            {
                  a[i]=sc.nextLong();
                  if(a[i]%2!=0)od+=1;
                  else e+=1;
                 
            }
            System.out.println((int)Math.min(e,od));
            
            
            
            
      }

}