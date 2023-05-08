import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int a[][]=new int[5][5];
            int r=0,c=0;
            for(int i=0;i<5;i++)
            {
                  for(int j=0;j<5;j++)
                  {
                        a[i][j]=sc.nextInt();
                        if(a[i][j]==1)
                        {
                              r=i;c=j;
                        }
                  }
            }
            System.out.println(((int)Math.abs(r-2)+(int)Math.abs(c-2)));
      }
}