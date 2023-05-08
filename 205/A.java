import java.util.*;
import java.lang.*;
import java.io.*;
public class Solution
{
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            List<Long>l=new ArrayList<>();
            HashMap<Long,Integer>h=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                  long a=sc.nextLong();
                  l.add(a);
                  h.put(a,i+1);
            }
            Collections.sort(l);
            int id=l.lastIndexOf(l.get(0));
            if(id!=0)System.out.println("Still Rozdil");
            else System.out.println(h.get(l.get(0)));
            
            
            
    }
}