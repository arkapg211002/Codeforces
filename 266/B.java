import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int t=sc.nextInt();
          StringBuilder s=new StringBuilder(sc.next());
          while(t>0)
          {
                ArrayList<Integer>a=new ArrayList<>();
                for(int i=0;i<s.length()-1;i++)
                {
                      if(s.charAt(i)=='B')a.add(i);
                }
                //System.out.println(a);
                for(int i=0;i<a.size();i++)
                {
                      int in=a.get(i);
                      if(s.charAt(in+1)=='G')
                      {
                            s.setCharAt(in,'G');
                            s.setCharAt(in+1,'B');
                      }
                }
                t-=1;
          }
          System.out.println(s.toString());
      }
}