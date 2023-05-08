import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            long a=0L;
            long e=0L,od=0L;
            long min=Long.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                  a=sc.nextLong();
                  if(a%2==0)e+=a;
                  else
                  {
                        od+=a;
                        min=(long)Math.min(min,a);
                  }
            }
            if(od%2!=0)od-=min;
            System.out.println((e+od));
            
    }
}