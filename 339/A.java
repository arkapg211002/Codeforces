import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            String s[]=sc.next().split("\\+");
            Arrays.sort(s);
            String res="";
            for(int i=0;i<s.length-1;i++)
            {
                  res+=s[i]+"+";
            }
            System.out.println(res+s[s.length-1]);
      }
}