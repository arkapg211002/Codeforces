import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            //System.out.println();
            while(t>0)
            {
                  int flag=0;
                  String a[]=new String[8];
                  for(int i=0;i<8;i++)
                        a[i]=sc.next();
                  for(int i=0;i<a.length;i++)
                        if(a[i].equals("RRRRRRRR")==true)flag=1;
                  if(flag==1)System.out.println("R");
                  else System.out.println("B");
                  t-=1;
            }
            
      }

}