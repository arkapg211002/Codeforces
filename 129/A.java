import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            int eve=0,odd=0,ods=0;
            for(int i=0;i<n;i++)
            {
                  a[i]=sc.nextInt();
                  if(a[i]%2==0)eve+=1;
                  else
                  {
                        odd+=1;
                        ods+=a[i];
                  }
            }
            if(ods%2!=0)System.out.println(odd);
            else
            {
                  System.out.println(eve);
            }
            
            
            
            
    }
}