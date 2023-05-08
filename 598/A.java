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
                  long s=n*(n+1)/2;
                  long p=1;
                  while(p<=n)
                  {
                        s-=(2*p);
                        p*=2;
                  }
                  System.out.println(s);
                  t-=1;
            }
        
    }
}