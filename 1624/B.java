import java.util.Scanner;

public class Solution {
  public static void main(String... args) {
    var s = new Scanner(System.in);
    var t = s.nextInt();
    for (int i = 0; i < t; i++) {
      var a = s.nextInt();
      var b = s.nextInt();
      var c = s.nextInt();
      var na = b - (c-b);
      if (na >= a && na%a==0 && na != 0) {
        System.out.println("YES");
        continue;
      }
      var nb = a + (c-a)/2;
      if (nb >= b && (c-a)%2==0 && nb%b == 0 && nb != 0) {
        System.out.println("YES");
        continue;
      }
      var nc = a + 2*(b-a);
      if (nc >= c && nc%c==0 && nc != 0) {
        System.out.println("YES");
        continue;
      }
      System.out.println("NO");
    }
  }

}