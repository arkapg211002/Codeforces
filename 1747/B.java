import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                  int n=sc.nextInt();
                  int k=0;
                  
                  if(n==1)
                  {
                        System.out.println(1);
                        System.out.println(1+" "+2);
                        t-=1;
                        continue;
                  }
                  if(n%2==0)System.out.println(n/2);
                  else System.out.println((n/2+1));
                  int i=1,j=3*n;
                  while(i<j)
                  {
                        System.out.println(i+" "+j);
                        i+=3;
                        j-=3;
                  }
                  
                  t-=1;
                  
                  
            }
            
    }
}