import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int a[][]=new int[3][3];
            int b[][]=new int[3][3];
            for(int i=0;i<3;i++)
            {
                  for(int j=0;j<3;j++)
                  {
                        a[i][j]=1;
                        b[i][j]=sc.nextInt();
                  }
                  //System.out.println();
            }
            for(int i=0;i<3;i++)
            {
                  for(int j=0;j<3;j++)
                  {
                        if(b[i][j]%2!=0)
                        {
                              a[i][j]=(1-a[i][j]);
                              if(i+1<3)a[i+1][j]=1-a[i+1][j];
                              if(j+1<3)a[i][j+1]=1-a[i][j+1];
                              if(i-1>=0)a[i-1][j]=1-a[i-1][j];
                              if(j-1>=0)a[i][j-1]=1-a[i][j-1];
                        }
                        
                  }
            }
            for(int i=0;i<3;i++)
            {
                  for(int j=0;j<3;j++)
                  {
                        System.out.print(a[i][j]);
                  }
                  System.out.println();
            }
      }

}