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
                  if(n%2==0)
                  {
                        for(int i=1;i<=n;i+=2)
                              System.out.print((i+1)+" "+i+" ");
                        System.out.println();
                  }
                  else
                  {
                        System.out.print(1+" ");
                        for(int i=3;i<=n;i+=2)
                              System.out.print(i+" "+(i-1)+" ");
                        System.out.println();
                  }
                  t-=1;
            }
            
            
      }
     
      
}