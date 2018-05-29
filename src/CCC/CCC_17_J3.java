package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '17 J3 - Exactly Electrical
 * Carson Tang
 */
public class CCC_17_J3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        String[] tokens1 = br.readLine().split(" ");
        int n = Integer.parseInt(br.readLine());
        int a = Math.abs(Integer.parseInt(tokens[0]) - Integer.parseInt(tokens1[0])) + Math.abs(Integer.parseInt(tokens[1]) - Integer.parseInt(tokens1[1]));
        if (a <= n && ((n - a) % 2) == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}