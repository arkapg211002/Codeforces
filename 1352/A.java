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
                 int c=(int)(Math.floor(Math.log10(n))+1);
                 String s[]=Integer.toString(n).split("");
                 List<Integer>l=new ArrayList<>();
                 int id=0,res=0;
                 for(int i=0;i<s.length;i++)
                 {
                       
                       if(s[i].equals("0")==false)
                       {
                             id=Integer.valueOf(s[i]);
                             
                             
                             res=id*(int)Math.pow(10,(s.length-1-i));
                             l.add(res);
                       }
                 }
                 System.out.println(l.size());
                 for(int i=0;i<l.size();i++)
                 {
                       System.out.print(l.get(i)+" ");
                 }
                 System.out.println();
                 t-=1;
                 
           }
           
           
      }
}