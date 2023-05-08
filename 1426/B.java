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
                  int n=sc.nextInt();
                  int m=sc.nextInt();
                  int flag=0;
                  while(n>0)
                  {
                        int a1=sc.nextInt();
                        int a2=sc.nextInt();
                        int b1=sc.nextInt();
                        int b2=sc.nextInt();
                        if(a2==b1)flag=1;
                        n-=1;
                  }
                  if(m%2!=0)
                  {
                        System.out.println("NO");
                        t-=1;
                        continue;
                  }
                  if(flag==1)System.out.println("YES");
                  else System.out.println("NO");
                  t-=1;
            }
            
            
    }
}