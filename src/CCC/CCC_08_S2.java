package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '08 S2 - Pennies in the Ring
 * Carson Tang
 */
public class CCC_08_S2 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int c = 0;
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                return;
            }
            for(int i = 1; i <= n; i++){
                c+= Math.sqrt(n*n - i*i) + 1;
            }
            System.out.println(c*4 + 1);
        }
    }
}