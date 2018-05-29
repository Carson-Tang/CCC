package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '17 S2 - High Tide, Low Tide
 * Carson Tang
 */
public class CCC_17_S2 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> x = new ArrayList<>();
        String [] tokens = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            x.add(Integer.parseInt(tokens[i]));
        }
        Collections.sort(x);
        if(n%2==0){
            for(int k = 1; k <= n; k++) {
                if (n / 2 - k < 0) {
                    break;
                } else {
                    System.out.print(x.get(n / 2 - k) + " ");
                }
                System.out.print(x.get(n / 2 + (k - 1)) + " ");
            }
        } else {
            int z = n/2;
            int c = 0;
            for(int k = 1; k <= n; k++) {
                System.out.print(x.get(z) + " ");
                c++;
                if(c%2!=0) {
                    z+=k;
                } else {
                    z-=k;
                }
            }
        }
    }
}