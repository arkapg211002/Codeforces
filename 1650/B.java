import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Code
{
    void run() {
        int tc=ni();
        StringBuilder sb=new StringBuilder();
        while(tc-->0) {
            int l=ni(),r=ni(),a=ni();
            if(l==r || a==1) sb.append((r/a) + (r%a));
            else if(a>r) sb.append(r);
            else if(r%a==0) sb.append((r/a) + a - 2);
            else {
                int k = ((r/a)*a) - 1;
                int p = k>=l ? ((k/a) + a - 1) : 0, q = (r/a) + (r%a);
                sb.append(max(p, q));
            }
            sb.append("\n");
        }
        out.println(sb);
        out.flush();
        out.close();
    }
    
    public static void main(String[] args)throws IOException {
        try {
            new Code().run();
        } catch(Exception e) {}
    }
    
    FastReader sc = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    
    String ns() { return sc.next(); }
    int ni() { return sc.nextInt(); }
    long nl() { return sc.nextLong(); }
    int[] ni(int n) {
        int a[]=new int[n];
        for(int i=0;i<n;a[i++]=ni());
        return a;
    }
    long[] nl(int n) {
        long a[]=new long[n];
        for(int i=0;i<n;a[i++]=nl());
        return a;
    }
    
    int[][] ni(int n,int m) {
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++) 
            for(int j=0;j<m;j++)
                a[i][j]=ni();
        return a;
    }
    long[][] nl(int n,int m) {
        long a[][]=new long[n][m];
        for(int i=0;i<n;i++) 
            for(int j=0;j<m;j++)
                a[i][j]=nl();
        return a;
    }
    int gcd(int a, int b) {
        return b==0?a:gcd(b,a%b);
    }
    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;
        FastReader(){ this(System.in); }
        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }
        
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res*1L*10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res *1L* sgn;
        }
        
        public String next() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
    
}