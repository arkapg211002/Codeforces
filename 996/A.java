import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int c=0;
           while(n>0)
           {
                 if(n>=100)
                 {
                       n-=100;
                       c+=1;
                 }
                 else if(n>=20 && n<100)
                 {
                       n-=20;
                       c+=1;
                 }
                 else if(n>=10 && n<20)
                 {
                       n-=10;
                       c+=1;
                 }
                 else if(n>=5 && n<10)
                 {
                       n-=5;
                       c+=1;
                 }
                 else if(n>=1 && n<5)
                 {
                       n-=1;
                       c+=1;
                 }
                 
           }
           System.out.println(c);
           
      }
}