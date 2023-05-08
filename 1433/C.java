import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                  int n=sc.nextInt();
                  long a[]=new long[n];
                  long m=0L;
                  for(int i=0;i<n;i++)
                  {
                        a[i]=sc.nextLong();
                        m=(long)Math.max(m,a[i]);
                  }
                  int id=-1;
                  for(int i=0;i<n;i++)
                  {
                        if(a[i]!=m)continue;
                        else if(i>0 && a[i-1]<m)id=i+1;
                        else if(i<n-1 && a[i+1]<m)id=i+1;
                  }
                  System.out.println(id);
                  t-=1;
                  
            }
      }
}