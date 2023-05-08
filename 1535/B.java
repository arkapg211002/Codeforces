import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int a;
            while(t>0)
            {
                  List<Integer>l=new ArrayList<>();
                  List<Integer>od=new ArrayList<>();
                  int n=sc.nextInt();
                  for(int i=0;i<n;i++)
                  {
                        a=sc.nextInt();
                        if(a%2==0)l.add(a);
                        else od.add(a);
                  }
                  l.addAll(od);
                  int c=0;
                  for(int i=0;i<n;i++)
                  {
                        for(int j=i+1;j<n;j++)
                        {
                              if(gcd(l.get(i),2*l.get(j))>1)c+=1;
                        }
                  }
                  System.out.println(c);
                  t-=1;
                  
            }
            
      }
      public static int gcd(int a,int b)
      {
            if(a==0)return b;
            else return gcd(b%a,a);
      }
      
}