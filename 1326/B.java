import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            String b[]=br.readLine().split(" ");
            long x=Long.parseLong(b[0]),res=0L;
            System.out.print(b[0]+" ");
            for(int i=1;i<b.length;i++)
            {
                  res=(Long.parseLong(b[i])+x);
                  System.out.print(res+" ");
                  x=(long)Math.max(x,res);
            }
            
            
      }

}