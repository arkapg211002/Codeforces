import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
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
                        a[i]=sc.nextInt();
                        
                  }
                  if(n==1)
                  {
                        System.out.println(0);
                        t-=1;
                        continue outer;
                  }
                  int c=0;
                  for(int i=n-2;i>=0;i--)
                  {
                        while(a[i]>=a[i+1] && a[i]>0)
                        {
                              a[i]/=2;
                              c+=1;
                        }
                        if(a[i]==a[i+1])
                        {
                              System.out.println(-1);
                              t-=1;
                              continue outer;
                        }
                  }
                  System.out.println(c);
                  t-=1;
                  
                  
            }
            
    }
}