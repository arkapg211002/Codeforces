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
                  long n=sc.nextLong();
                  long k=sc.nextLong();
                  
                  if(n%k==0)
                  {
                        System.out.println(n);
                        t-=1;
                        continue;
                  }
                  
                  if(n<k && n<=k/2)
                  {
                        System.out.println(n);
                        t-=1;
                        continue;
                  }
                  if(n<k && n>k/2)
                  {
                        System.out.println(k/2);
                        t-=1;
                        continue;
                  }
                  
                  long d=k/2;
                  
                  long c=n/k;
                  
                  long e=(c*k)+d;
                  if(e>n)e=n;
                  System.out.println(e);
                  t-=1;
            }
                  
                  
            
            
    }
}