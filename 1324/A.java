import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Codechef_Contest_30_Number_2022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> h=new ArrayList<>();
        int n=sc.nextInt();
        while(n>0) {
            int a = sc.nextInt();
            while (a > 0) {
                int g = sc.nextInt();
                h.add(g);
                a--;
            }

            int diff = 0;
            for (int i = 1; i < h.size(); i++) {
                if (Math.abs(h.get(i) - h.get(i - 1)) % 2 != 0) {
                    diff = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if (diff == 0) {
                System.out.println("YES");
            }
            h.clear();
            n--;
        }

    }
}