import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
      public static void main(String args[]) throws java.lang.Exception
      {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           String s[]=new String[n];
           int c=0;
           for(int i=0;i<n;i++)
           {
                 s[i]=sc.next();
                 if(s[i].equals("Tetrahedron")==true)c+=4;
                 else if(s[i].equals("Cube")==true)c+=6;
                 else if(s[i].equals("Octahedron")==true)c+=8;
                 else if(s[i].equals("Dodecahedron")==true)c+=12;
                 else if(s[i].equals("Icosahedron")==true)c+=20;
           }
           System.out.println(c);
           
      }
}