package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '16 J4 - Arrival Time
 * Carson Tang
 */
public class CCC_16_J4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tokens = br.readLine().split(":");
        int h = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int t;
        t = h*60 + m;
        for(int i = 240; i > 0; t++){
            if(t>=7*60 && t<10*60){
                i--;
            } else if (t>=15*60 && t<19*60) {
                i--;
            } else {
                i-=2;
            }
        }
        System.out.printf("%02d:%02d",t/60%24,t%60);
    }
}