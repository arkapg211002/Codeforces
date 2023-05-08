import java.io.*;
import java.util.*;

public class A732 {
    public static void main(String[] args) {
        Sourin sc = new Sourin();

        int k = sc.nextInt();
        int r = sc.nextInt();
        
        int count = 0, cost = 0;

        while (true) {
            cost = k * ++count;

            if (cost % 10 == 0 || cost % 10 == r) {
                break;
            }
        }

        System.out.println(count);
    }

	static class Sourin {
		BufferedReader br; 
		StringTokenizer st;
		
		public Sourin() {br = new BufferedReader(new InputStreamReader(System.in));}

		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (IOException e) { e.printStackTrace(); }
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";
			try {
				if (st.hasMoreTokens()) str = st.nextToken("\n");
				else str = br.readLine();
			}
			catch (IOException e) { e.printStackTrace(); }
			return str;
		}
	}

	static int IMAX = Integer.MAX_VALUE, IMIN = Integer.MIN_VALUE;
	static long LMAX = Long.MAX_VALUE, LMIN = Long.MIN_VALUE;

	static int gcd(int a, int b) {
		return (b == 0)? a : gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}