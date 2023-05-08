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
                  StringBuilder sb=new StringBuilder();
                  if(n%2!=0)
                  {
                        sb.append("7");
                        n=(n-3)/2;
                  }
                  else n/=2;
                  while(n-->0)sb.append("1");
                  System.out.println(sb);
                  t-=1;
            }
        
    }
}