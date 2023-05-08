import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            int l=sc.nextInt();
            int m=sc.nextInt();
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[d];
            if(k==1 || l==1 || m==1 || n==1)System.out.println(d);
            else
            {
                  int i;
                  for(i=k-1;i<d;i+=k)
                        a[i]=1;
                  for(i=l-1;i<d;i+=l)
                        a[i]=1;
                  for(i=m-1;i<d;i+=m)
                        a[i]=1;
                  for(i=n-1;i<d;i+=n)
                        a[i]=1;
                  Arrays.sort(a);
                  int c=0;
                  for(i=0;i<d;i++)
                  {
                        if(a[i]==0)c+=1;
                        else break;
                  }
                  System.out.println((d-c));
            }
      }
}