import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer>h=new HashSet<>();
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
              h.add(sc.nextInt());
             
        }
        int b=sc.nextInt();
        for(int i=0;i<b;i++)
        {
              h.add(sc.nextInt());
              
        }
        if(h.size()==n)System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
                
      }
}