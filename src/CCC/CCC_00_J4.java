package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '00 J4 - Babbling Brooks
 * Carson Tang
 */
public class CCC_00_J4 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Double> x = new ArrayList<>();
        int r;
        for (int i = 0; i < n; i++) {
            r = Integer.parseInt(br.readLine());
            x.add((double) r);
        }
        String s;
        int a, b;
        while (true) {
            s = br.readLine();
            if (s.equals("77")) {
                for (double e : x) {
                    System.out.print((int)e + " ");
                }
                return;
            } else if (s.equals("99")) {
                a = Integer.parseInt(br.readLine());
                b = Integer.parseInt(br.readLine());
                x.add(a - 1, x.get(a - 1) * ((double) b / 100));
                x.add(a + 1, x.get(a) * ( 1 - (double)b / 100));
                x.remove(a);
            } else if (s.equals("88")) {
                a = Integer.parseInt(br.readLine());
                x.add(a-1, x.get(a) + x.get(a - 1));
                x.remove(a);
                x.remove(a);
            }
        }
	}
}
