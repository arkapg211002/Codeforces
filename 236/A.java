import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            HashSet<Character>h=new HashSet<>();
            for(int i=0;i<s.length();i++)
            {
                  h.add(s.charAt(i));
            }
            if(h.size()%2==0)System.out.println("CHAT WITH HER!");
            else System.out.println("IGNORE HIM!");
      }
}