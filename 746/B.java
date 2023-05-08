import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            StringBuilder sb=new StringBuilder(sc.next());
            String s="";
            if(n%2!=0)
            {
                  s+=sb.charAt(0);
                  
                  for(int i=2;i<n;i+=2)
                  {
                        s=s+sb.charAt(i);
                        s=sb.charAt(i-1)+s;
                  }
            }
            else
            {
                  s+=sb.charAt(0);
                  for(int i=2;i<n;i+=2)
                  {
                        s=sb.charAt(i)+s;
                        s=s+sb.charAt(i-1);
                  }
                  s+=sb.charAt(n-1);
            }
            System.out.println(s);
        
    }
}