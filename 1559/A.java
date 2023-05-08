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
                  int k=sc.nextInt();
                  for(int i=1;i<n;i++)
                  {
                        k=k&(sc.nextInt());
                  }
                  System.out.println(k);
                  t-=1;
                  
            }
            
            
    }
}