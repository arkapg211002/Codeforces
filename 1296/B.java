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
                  long s=sc.nextLong();
                  long c=s;
                  long d=0L;
                  while(s>=10)
                  {
                        d+=s%10;
                        c+=s/10;
                        s/=10;
                        s+=d;
                        d=0;
                        
                  }
                  System.out.println(c);
                  t-=1;
            }
            
      }
}