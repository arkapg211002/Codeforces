import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int k=sc.nextInt();
            int a[]=new int[12];
            for(int i=0;i<12;i++)
            {
                  a[i]=sc.nextInt();
            }
            if(k==0)System.out.println(0);
            else
            {
                  Arrays.sort(a);
                  int c=0,s=0;
                  for(int i=11;i>=0;i--)
                  {
                        s+=a[i];
                        c+=1;
                        if(s>=k)break;
                  }
                  if(s>=k)System.out.println(c);
                  else System.out.println(-1);
            }
            
      }
}