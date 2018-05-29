package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '16 S1 - Ragaman
 * Carson Tang
 */
public class CCC_16_S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String f = br.readLine();
        int c =0;
        for(int i = 0; i < f.length(); i++) {
            if(f.charAt(i)=='*'){
                c++;
            } else {
                s = s.replaceFirst(Character.toString(f.charAt(i)), "");
            }
        }
        if(s.length()-c==0){
            System.out.println("A");
        } else {
            System.out.println("N");
        }
    }
}