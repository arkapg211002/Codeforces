import java.util.Scanner;
 
public class Solution {
    public static void main(String... args) {
      var s = new Scanner(System.in);
      var n = s.nextInt();
      System.out.println(n > 0 ? n : Math.max(n / 10, n%10+n/100*10));
    }
  }