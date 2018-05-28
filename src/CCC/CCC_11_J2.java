package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '11 J2 - Who Has Seen The Wind
 * Carson Tang
 */
public class CCC_11_J2 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= m; i++) {
            if((-6)*i*i*i*i + h*i*i*i + 2*i*i + i <=0) {
                System.out.println("The balloon first touches ground at hour: ");
                System.out.println(i);
                break;
            } else if (i==m) {
                System.out.println("The balloon does not touch ground in the given time.");
            }
        }
    }
}