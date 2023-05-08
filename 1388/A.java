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
                  List<Integer>l=new ArrayList<>();
                  int s=0;
                  int i=2,j=3;
                  
                  if(n<=30)System.out.println("NO");
                  else
                  {
                        System.out.println("YES");
                        int d=n-(6+10+14);
                        if(d==6)System.out.println("6 10 15 "+(n-31));
                        else if(d==14)System.out.println("6 10 15 "+(n-31));
                        else if(d==10)System.out.println("6 10 15 "+(n-31));
                        else System.out.println("6 10 14 "+(n-30));
                  }
                  t-=1;
            }
      }
      
}