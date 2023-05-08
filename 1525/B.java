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
                  int a[]=new int[n];
                  int c=1;
                  a[0]=sc.nextInt();
                  for(int i=1;i<n;i++)
                  {
                        a[i]=sc.nextInt();
                        if(a[i]>a[i-1])c+=1;
                  }
                  if(c==n)
                  {
                        System.out.println(0);
                        t-=1;
                        continue;
                  }
                  else if(a[0]==1 || a[n-1]==n)
                  {
                        System.out.println(1);
                        t-=1;
                        continue;
                  }
                  else if(a[0]==n && a[n-1]==1)
                  {
                        System.out.println(3);
                        t-=1;
                        continue;
                  }
                  System.out.println(2);
                  t-=1;
            }
      }

}