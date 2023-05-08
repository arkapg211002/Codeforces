import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            long a[]=new long[n];
            long z=0L,neg=0L,p=0L,cneg=0L;
            for(int i=0;i<n;i++)
            {
                  a[i]=sc.nextInt();
                  if(a[i]==0)z+=1;
                  if(a[i]>1)p+=(a[i]-1);
                  if(a[i]<-1)neg+=(-1-a[i]);
                  if(a[i]<0)cneg+=1;
            }
            long tot=z+p+neg;
            if(cneg%2!=0 && z==0)tot+=2;
            System.out.println(tot);
    }
}