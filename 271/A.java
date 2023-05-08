import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         while(true)
         {
               int c=n+1;
               String s=Integer.toString(c);
               HashSet<Character>h=new HashSet<>();
               for(int i=0;i<4;i++)
               {
                     h.add(s.charAt(i));
               }
               if(h.size()==4)
               {
                     System.out.println(s);
                     break;
               }
               else n+=1;
         }
         
                
      }
}