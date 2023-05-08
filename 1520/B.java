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
                  long n=sc.nextLong();
                  int c=0;
                  for(long i=1;i<=n;i=i*10+1)
                  {
                        for(int j=1;j<=9;j++)
                        {
                              if(i*j<=n)c+=1;
                        }
                  }
                  System.out.println(c);
                  t-=1;
                  
            }
            
            
            
      }
      
}