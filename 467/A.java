import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int c=0;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
              a[i][0]=sc.nextInt();
              a[i][1]=sc.nextInt();
              if(a[i][1]-a[i][0]>=2)c+=1;
        }
        System.out.println(c);
                
      }
}