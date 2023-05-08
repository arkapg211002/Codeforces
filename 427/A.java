import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           
           int a;
           int id=0,c=0;
           for(int i=0;i<n;i++)
           {
                 a=sc.nextInt();
                 if(a==-1 && c==0)id+=1;
                 else if(a==-1 && c!=0)c-=1;
                 else if(a!=-1)c+=a;
           }
           if(id!=0 && c>=0)System.out.println(id);
           else if(id!=0 && c<0)System.out.println((id+(c*(-1))));
           else if(id==0 && c>=0)System.out.println(0);
           else if(id==0 && c<0)System.out.println((-1)*c);
           
           
      }
}