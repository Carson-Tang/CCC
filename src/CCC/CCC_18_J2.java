package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '18 J2 - Occupy parking
 * Carson Tang
 */
public class CCC_18_J2 {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String a = sc.readLine();
        String b = sc.readLine();
        int c=0;
        for(int i = 0; i < n; i++){
            if((a.charAt(i)=='C')&&(b.charAt(i)=='C')){
                c++;
            }
        }
        System.out.println(c);
    }
}