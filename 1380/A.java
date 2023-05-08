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
                  int a[]=new int[n];
                  for(int i=0;i<n;i++)
                  {
                        a[i]=sc.nextInt();
                        
                  }
                  
                  for(int i=1;i<n;i++)
                  {
                        int pid=0;
                        boolean prev=false;
                        for(int j=0;j<i;j++)
                        {
                              if(a[j]<a[i])
                              {
                                    prev=true;
                                    pid=j;
                                    break;
                              }
                        }
                        boolean next=false;
                        int nid=0;
                        for(int k=i+1;k<n;k++)
                        {
                              if(a[k]<a[i])
                              {
                                    nid=k;
                                    next=true;
                                    break;
                              }
                        }
                        if(next==true && prev==true)
                        {
                              System.out.println("YES");
                              System.out.println((pid+1)+" "+(i+1)+" "+(nid+1));
                              t-=1;
                              continue outer;
                        }
                  }
                  System.out.println("NO");
                  t-=1;
            }
    }
}