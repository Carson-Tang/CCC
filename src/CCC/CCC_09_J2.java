package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '09 J2 - Old Fishin' Hole
 * Carson Tang
 */
public class CCC_09_J2 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int o =0;
        for(int i = 0; i <= t; i++) {
            for(int k =0; k <= t; k++) {
                for(int j = 0; j <= t; j++) {
                    if(((i*a)+(k*b)+(j*c)<=t)){
                        if(i>0 || k > 0 || j > 0) {
                            System.out.println(i + " Brown Trout, " + k + " Northern Pike, " + j + " Yellow Pickerel");
                            o++;
                        }
                    }
                }
            }
        }
        System.out.println("Number of ways to catch fish: " + o);
    }
}