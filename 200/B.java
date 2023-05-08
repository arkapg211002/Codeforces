import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++)
        {
              s+=sc.nextInt();
              
        }
        System.out.println((double)(s)/(double)(n));
                
      }
}