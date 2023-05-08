import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                  int n=sc.nextInt();
                  int a=sc.nextInt();
                  int b=sc.nextInt();
                  int c=sc.nextInt();
                  int d=sc.nextInt();
                  int a1=a-b;
                  int a2=a+b;
                  int t1=c-d;
                  int t2=c+d;
                  
                  int A1=a1*n;
                  int A2=a2*n;
                  
                  double avg=(t2+t1)/(2*1.0);
                  
                  double num=avg/(n*1.0);
                  
                  if((A1>=t1 && A1<=t2) || (A2>=t1 && A2<=t2))
                        System.out.println("YES");
                  else
                  {
                        //System.out.println();
                        if(num>=(double)a1 && num<=(double)a2)
                              System.out.println("YES");
                        else System.out.println("NO");
                  }
                  t-=1;
            }
      }
     
      
}