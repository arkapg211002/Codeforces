import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();int c=0,res=0;
            
            while(n>0)
            {
                  int a=sc.nextInt();
                  int b=sc.nextInt();
                  int cd=sc.nextInt();
                  if(a==1)c+=1;
                  if(b==1)c+=1;
                  if(cd==1)c+=1;
                  if(c>=2)res+=1;
                  c=0;
                  n-=1;
            }
            System.out.println(res);
            
      }
}