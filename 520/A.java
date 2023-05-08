import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           int n=Integer.parseInt(br.readLine());
           String s=br.readLine();
           s=s.toLowerCase();
           HashSet<Character>h=new HashSet<Character>();
           for(int i=0;i<s.length();i++)
           {      //System.out.println(s.charAt(i));
                 if(s.charAt(i)!=' ')h.add(s.charAt(i));
                 
           }
           if(h.size()==26)System.out.println("YES");
           else System.out.println("NO");
           
      }
}