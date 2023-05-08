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
                  long x1=sc.nextInt();
                  long p1=sc.nextInt();
                  long x2=sc.nextInt();
                  long p2=sc.nextInt();
                  long nx1=(long)(Math.floor(Math.log10(x1))+1);
                  long nx2=(long)(Math.floor(Math.log10(x2))+1);
                  if(nx1+p1>nx2+p2)System.out.println(">");
                  else if(nx1+p1<nx2+p2)System.out.println("<");
                  else if(nx1>nx2)
                  {
                        long nd=nx1-nx2;
                        x2=x2*(long)Math.pow(10,nd);
                        if(x1>x2)System.out.println(">");
                        else if(x1<x2)System.out.println("<");
                        else System.out.println("=");
                  }
                  else
                  {
                        long nd=nx2-nx1;
                        x1=x1*(long)Math.pow(10,nd);
                        if(x1>x2)System.out.println(">");
                        else if(x1<x2)System.out.println("<");
                        else System.out.println("=");
                  }
                  
                  t-=1;
            }
            
            
      }

}