import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)System.out.println("I hate it");
        else if(n==2)System.out.println("I hate that I love it");
        else if(n==3)System.out.println("I hate that I love that I hate it");
        else
        {
              String h="I hate";
              String l="I love";
              String res="I hate that I love that I hate";
              for(int i=4;i<=n;i++)
              {
                    if(i%2==0)res+=" that "+l;
                    else res+=" that "+h;
              }
              System.out.println(res+" it");
        }
                
      }
}