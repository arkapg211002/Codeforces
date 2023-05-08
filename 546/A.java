import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           long k=sc.nextLong();
           long n=sc.nextLong();
           long w=sc.nextLong();
           long s=w*(w+1)/2*k;
           long d=s-n;
           if(d>=0)System.out.println(d);
           else System.out.println(0);
      }
}