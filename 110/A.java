import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           String s=sc.next();
           int c=0;
           for(int i=0;i<s.length();i++)
           {
                 if(s.charAt(i)=='4' || s.charAt(i)=='7')
                 {
                       c+=1;
                 }
           }
           String st=Integer.toString(c);
           int i;
           for(i=0;i<st.length();i++)
           {
                 if(st.charAt(i)!='4' && st.charAt(i)!='7')
                 {
                       System.out.println("NO");
                       break;
                 }
           }
           if(i>=st.length())System.out.println("YES");
           
      }
}