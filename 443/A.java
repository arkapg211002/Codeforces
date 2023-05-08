import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           //Scanner sc=new Scanner(System.in);
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String s=br.readLine();
           if(s.length()==2)System.out.println(0);
           else if(s.length()==3)System.out.println(1);
           else{
                 s=s.substring(1,s.length()-1);
                 String a[]=s.split(", ");
                 HashSet<String>h=new HashSet<>();
                 for(int i=0;i<a.length;i++)
                 {
                       h.add(a[i]);
                       
                 }
                 System.out.println(h.size());
           }
           
      }
}