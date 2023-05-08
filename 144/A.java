import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                  l.add(sc.nextInt());
                  
            }
            int max=Collections.max(l);
            int min=Collections.min(l);
            int imax=l.indexOf(max);
            int imin=l.lastIndexOf(min);
            if(max==min || imax==imin)System.out.println(0);
            else if(imin>imax)System.out.println((imax+n-1-imin));
            else if(imin<imax)System.out.println((imax+n-1-imin-1));
      }
}