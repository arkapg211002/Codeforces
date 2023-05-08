import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            outer:
            while(t>0)
            {
                  int n=sc.nextInt();
                  long a[]=new long[n];
                  
                  for(int i=0;i<n;i++)
                  {
                        a[i]=sc.nextLong();
                        
                  }
                  for(int i=1;i<n;i++)
                  {
                        if(a[i]>=a[i-1])
                        {
                              System.out.println("YES");
                              t-=1;
                              continue outer;
                        }
                  }
                  System.out.println("NO");
                  t-=1;
            }
            
            
            
            
      }

}