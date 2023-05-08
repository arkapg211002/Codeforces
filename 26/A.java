import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int c=0;
            for(int i=6;i<=n;i++)
            {
                  HashSet<Integer>h=new HashSet<>();
                  int t=i;
                  while(t%2==0)
                  {
                        t/=2;
                        h.add(2);
                  }
                  inner:
                  for(int j=3;j<=Math.sqrt(t);j++)
                  {
                        while(t%j==0)
                        {
                              t/=j;
                              h.add(j);
                        }
                        if(h.size()>2)break inner;
                  }
                  if(t>2)h.add(t);
                  if(h.size()==2)c+=1;
            }
            System.out.println(c);
            
      }
     
      
}