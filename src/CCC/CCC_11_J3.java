package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '11 J3 - Sumac Sequences
 * Carson Tang
 */
public class CCC_11_J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = 2;
        int c=0;
        while(n>=m && n>=0 && m>= 0) {
            t++;
            c=n-m;
            n=m;
            m=c;
        }
        System.out.println(t);
    }
}