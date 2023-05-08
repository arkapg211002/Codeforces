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
                  int x=sc.nextInt();
                  int a[]=new int[201];
                  int in=0;
                  for(int i=0;i<n;i++)
                  {
                        in=sc.nextInt();
                        a[in]=1;
                  }
                  int c=0;
                  for(int i=1;i<a.length;i++)
                  {
                        if(a[i]==0)
                        {
                              a[i]=1;
                              x-=1;
                        }
                        if(x==0)
                        {
                              c=i;
                              break;
                        }
                  }
                  int d=0;
                  for(int i=c+1;i<a.length;i++)
                  {
                        if(a[i]==1)d+=1;
                        else break;
                  }
                  System.out.println((c+d));
                  t-=1;
            
            }
            
    }
}