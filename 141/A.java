import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           String g=sc.next();
           String h=sc.next();
           String p[]=sc.next().split("");
           String res[]=(g+h).split("");
           Arrays.sort(res);
           Arrays.sort(p);
           String a="",b="";
           for(int i=0;i<res.length;i++)a+=res[i];
           for(int i=0;i<p.length;i++)b+=p[i];
           if(a.equals(b))System.out.println("YES");
           else System.out.println("NO");
           
           
      }
}