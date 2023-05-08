import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                  int n=sc.nextInt();
                  long a[]=new long[n];
                  long sum=0L;
                  for(int i=0;i<n;i++)
                  {
                        a[i]=sc.nextLong();
                  }
                  int j=0;
                  while(j<n && a[j]==0)j+=1;
                  for(int i=j;i<n-1;i++)
                  {
                        sum+=a[i];
                        if(a[i]==0)sum+=1;
                  }
                  System.out.println(sum);
                  t-=1;
            }
            
            
    }
}