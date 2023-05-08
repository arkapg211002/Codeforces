import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int d=sc.nextInt();
            int t[]=new int[n];
            int s=0;
            for(int i=0;i<n;i++)
            {
                  t[i]=sc.nextInt();
                  s+=t[i];
            }
            s+=((n-1)*10);
            if(s>d)System.out.println(-1);
            else
            {
                  System.out.println(((n-1)*2)+((d-s)/5));
            }
            
      }

}