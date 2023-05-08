import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           String s=sc.next();
           int u=0,l=0;
           for(int i=0;i<s.length();i++)
           {
                 if(Character.isUpperCase(s.charAt(i))==true)u+=1;
                 else l+=1;
           }
           if(u>l)System.out.println(s.toUpperCase());
           else System.out.println(s.toLowerCase());
      }
}