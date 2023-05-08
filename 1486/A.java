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
                  long s=0L,c=0L;
                  for(int i=0;i<n;i++)
                  {
                        c+=i;
                        s+=a[i];
                        if(s<c)
                        {
                              System.out.println("NO");
                              t-=1;
                              continue outer;
                        }
                  }
                  System.out.println("YES");
                  t-=1;
            }
      }
      
     
      
}