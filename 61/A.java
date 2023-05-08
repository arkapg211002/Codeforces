import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
        Scanner sc=new Scanner(System.in);
        StringBuilder a=new StringBuilder(sc.next());
        StringBuilder b=new StringBuilder(sc.next());
        
        String p="";
        for(int i=0;i<a.length();i++)
        {
              if(a.charAt(i)!=b.charAt(i))p+='1';
              else p+='0';
        }
        System.out.println(p);
                
      }
}