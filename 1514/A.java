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
                  int n=sc.nextInt();
                  boolean res=false;
                  
                  for(int i=0;i<n;i++)
                  {
                        int a=sc.nextInt();
                        if(Math.sqrt(a)-(int)Math.sqrt(a)!=0){
                              res=true;
                              
                        }
                  }
                  if(res==true)System.out.println("YES");
                  else System.out.println("NO");
                  t-=1;
            }
            
            
      }
     
      
}