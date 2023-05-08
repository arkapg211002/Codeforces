import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long [] arr = new long[n + 1];
        arr[0] = 0;
        for (int i = 1; i <= n; i++) arr[i] = sc.nextLong();
        Arrays.sort(arr);
        for (int i = 1; i <= n; i++) arr[i] += arr[i - 1];
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(arr[n - x + y] - arr[n - x]);
        }
    }
}