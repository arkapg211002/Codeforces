import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            StringBuilder s=new StringBuilder(sc.next());
            
            while(s.indexOf("14")==0 || s.indexOf("144")==0 || s.indexOf("1")==0)
            {
                  if(s.indexOf("144")==0)s.delete(0,3);
                  else if(s.indexOf("14")==0)s.delete(0,2);
                  else if(s.indexOf("1")==0)s.delete(0,1);
                  
            }
            if(s.isEmpty()==true)System.out.println("YES");
            else System.out.println("NO");
            
      }
}