package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '17 J2 - Shifty Sum
 * Carson Tang
 */
public class CCC_17_J2 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int s = n;
        for(int i = 1; i <= k; i++) {
            s+=n*Math.pow(10,i);
        }
        System.out.println(s);
    }
}