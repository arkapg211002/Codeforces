import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                  a[i]=sc.nextInt();
                  b[i]=sc.nextInt();
                  
            }
            int s=a[0]*b[0];
            int c=b[0];
            for(int i=1;i<n;i++)
            {
                  if(b[i]<c)c=b[i];
                  s+=a[i]*c;
            }
            System.out.println(s);
            
            
            
            
            
      }

}