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
                  long x=sc.nextLong();
                  long y=sc.nextLong();
                  long d=x-y;
                  if(d%2==0)
                  {
                        System.out.println("YES");
                        t-=1;
                        continue outer;
                  }
                  /*for(int i=3;i<=Math.sqrt(d);i+=2)
                  {
                        if(d%i==0)
                        {
                              System.out.println("YES");
                              t-=1;
                              continue outer;
                        }
                  }
                  if(d>2)
                  {
                        System.out.println("YES");
                        t-=1;
                        continue outer;
                  }
                  System.out.println("NO");*/
                  else if(d%2!=0 && d!=1)
                  {
                        System.out.println("YES");
                        t-=1;
                        continue outer;
                  }
                  
                  System.out.println("NO");
                  
                  t-=1;
            }
        
    }
}