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
                  int c=0;
                  int a[]=new int[101];
                  int f[]=new int[101];
                  for(int i=0;i<n;i++)
                  {
                        a[i]=sc.nextInt();
                        f[a[i]]+=1;
                  }
                  for(int i=0;i<101;i++)
                  {
                        if(f[i]==0)
                        {
                              c+=i;
                              break;
                        }
                  }
                  for(int i=0;i<101;i++)
                  {
                        if(f[i]<2)
                        {
                              c+=i;
                              break;
                        }
                  }
                  System.out.println(c);
                  t-=1;
                  
            }
            
    }
}