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
                  int x=sc.nextInt();
                  List<Integer>l=new ArrayList<>();
                  int s=0,last=9;
                  while(s<x && last>0)
                  {
                        l.add((int)Math.min(x-s,last));
                        s+=last;
                        last-=1;
                  }
                  if(s<x)System.out.println(-1);
                  else
                  {
                        Collections.sort(l);
                        for(int i=0;i<l.size();i++)
                        {
                              System.out.print(l.get(i));
                        }
                        System.out.println();
                  }
                  t-=1;
            }
            
      }
}