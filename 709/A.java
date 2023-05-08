import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int b=sc.nextInt();
            int d=sc.nextInt();
            //int a[]=new int[n];
            int c=0,a=0,s=0;
            for(int i=0;i<n;i++)
            {
                  a=sc.nextInt();
                  if(a>b)continue;
                  s+=a;
                  if(s>d)
                  {
                        c+=1;
                        s=0;
                  }
            }
            System.out.println(c);
            
      }
      
     
      
}