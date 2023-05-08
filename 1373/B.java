import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                  StringBuilder sb=new StringBuilder(sc.next());
                  int one=0,zero=0;
                  for(int i=0;i<sb.length();i++)
                  {
                        if(sb.charAt(i)=='0')zero+=1;
                        else one+=1;
                  }
                  if(one%2==0 && zero%2==0)System.out.println("NET");
                  else if(one%2!=0 && zero%2!=0)System.out.println("DA");
                  else if(one%2!=0 && zero%2==0)
                        System.out.println((one<zero)?"DA":"NET");
                  else if(one%2==0 && zero%2!=0)
                        System.out.println((one<zero)?"NET":"DA");
                  t-=1;
            }
      }
     
      
}