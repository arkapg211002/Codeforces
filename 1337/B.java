import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int x=0,n=0,m=0;
            while(t>0)
            {
                  x=sc.nextInt();
                  n=sc.nextInt();
                  m=sc.nextInt();
                  while(x>0 && n>0 && x/2+10<=x)
                  {
                        x=x/2+10;
                        n-=1;
                        
                        
                  }
                  
                  if(m*10>=x)System.out.println("YES");
                  else System.out.println("NO");
                  t-=1;
                  
            }
            
      }
}