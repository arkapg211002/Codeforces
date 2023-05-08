import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n%2==0)
            {
                  System.out.println(n/2);
                  for(int i=0;i<n/2;i++)
                  {
                        System.out.print(2+" ");
                  }
            }
            else
            {
                  System.out.println(n/2);
                  for(int i=0;i<n/2-1;i++)
                  {
                        System.out.print(2+" ");
                  }
                  System.out.print(3);
            }
            
            
            
      }
      
}