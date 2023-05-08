import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           long n=sc.nextLong();
           long k=sc.nextLong();
           /*
           List<Long>l=new ArrayList<>();
           List<Long>e=new ArrayList<>();
           for(long i=1;i<=n;i++)
           {
                 if(i%2==0L)e.add(i);
                 else l.add(i);
           }
           l.addAll(e);
           System.out.println(l.get(k-1));*/
           if(n%2==0 && k<=n/2)System.out.println((2*k-1));
           else if(n%2==0 && k>n/2)System.out.println(2*(k-(n/2)));
           else if(n%2!=0 && k<=n/2+1)System.out.println((2*k-1));
           else System.out.println(2*(k-(n/2+1)));
           
           
           
      }
}