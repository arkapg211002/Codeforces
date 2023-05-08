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
                  String s=sc.next();
                  char ch='\u0000';
                  if(s.charAt(0)==s.charAt(s.length()-1))
                        System.out.println(s);
                  else
                  {
                        if(s.charAt(s.length()-1)=='a')ch='b';
                        else ch='a';
                        System.out.println(s.substring(0,s.length()-1)+ch);
                  }
                  t-=1;
            }
    }
}