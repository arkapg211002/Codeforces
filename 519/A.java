import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            HashMap<Character,Integer>h=new HashMap<>();
            //'q', 'r', 'b', 'n', 'p', 'k'
            h.put('q',9);
            h.put('r',5);
            h.put('b',3);
            h.put('n',3);
            h.put('p',1);
            h.put('k',0);
            h.put('Q',9);
            h.put('R',5);
            h.put('B',3);
            h.put('N',3);
            h.put('P',1);
            h.put('K',0);
            
            int w=0,b=0;
            String s="";
            char ch='\u0000';
            for(int i=1;i<=8;i++)
            {
                  s=sc.next();
                  if(s.equals("........")==true)continue;
                  for(int j=0;j<8;j++)
                  {
                        ch=s.charAt(j);
                        if(ch=='.')continue;
                        else if(Character.isUpperCase(ch)==true)w+=h.get(ch);
                        else if(Character.isLowerCase(ch)==true)b+=h.get(ch);
                  }
            }
            
            if(b>w)System.out.println("Black");
            else if(b<w)System.out.println("White");
            else System.out.println("Draw");
            
            
            
    }
}