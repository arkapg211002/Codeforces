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
                  long a=sc.nextLong();
                  long b=sc.nextLong();
                  if(a%b==0)System.out.println(0);
                  else
                  {
                        System.out.println(((((a/b)+1)*b)-a));
                  }
                  t-=1;
                  
            }
      }
}