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
        String p="";
        int c=0;
        for(int i=1;i<n;i++)
        {
              p=sc.next();
              if(p.equals(s)==true)continue;
              else 
              {
                    s=p;
                    c+=1;
              }
        }
        System.out.println((c+1));
                
      }
}