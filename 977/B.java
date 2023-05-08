import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String s=sc.next();
            HashMap<String,Integer>h=new HashMap<>();
            String ch="";
            for(int i=0;i<n-1;i++)
            {
                  ch=s.substring(i,i+2);
                  if(h.containsKey(ch)==false)h.put(ch,1);
                  else h.put(ch,h.get(ch)+1);
            }
            int max=0;String res="";
            for(Map.Entry<String,Integer>e:h.entrySet())
            {
                  if(e.getValue()>max)
                  {
                        max=e.getValue();
                        res=e.getKey();
                  }
                  
            }
            System.out.println(res);
            
      }
}