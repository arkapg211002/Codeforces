import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        HashSet<String>h=new HashSet<>();
        for(int i=0;i<s.length;i++)
        {
              
              h.add(s[i]);
        }
        
        System.out.println((4-h.size()));
                
      }
}