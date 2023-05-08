import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            StringBuilder sb=new StringBuilder(sc.next());
            int c=0,d=0;
            for(int i=0;i<sb.length();i++)
            {
                  if(sb.charAt(i)=='0')c+=1;
                  else d+=1;
            }
            System.out.println((int)Math.abs(c-d));
            /*String s[]=sc.next().split("");
            Arrays.sort(s);
            int c=s.lastIndexOf('0');
            System.out.println((int)Math.abs(c-(n-1-c)));*/
            
      }
}