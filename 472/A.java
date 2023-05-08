import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a=0,b=0;
            for(int i=n/2;i>=4;i--)
            {
                  if(com(i)==true && com(n-i)==true)
                  {
                        a=i;b=n-i;
                        break;
                  }
            }
            System.out.println(a+" "+b);
            
      }
      public static boolean com(int n)
      {
            for(int i=2;i<=n/2;i++)
            {
                  if(n%i==0)
                        return true;
            }
            return false;
      }
}