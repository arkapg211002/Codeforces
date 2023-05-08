import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
         Scanner sc=new Scanner(System.in);
         String s="qwertyuiopasdfghjkl;zxcvbnm,./";
         char c=sc.next().charAt(0);
         String st=sc.next();
         String p="";
         if(c=='R')
         {
               for(int i=0;i<st.length();i++)
               {
                     p+=s.charAt(s.indexOf(st.charAt(i))-1);
               }
         }
         else
         {
               for(int i=0;i<st.length();i++)
               {
                     p+=s.charAt(s.indexOf(st.charAt(i))+1);
               }
         }
         System.out.println(p);
         
           
           
      }
}