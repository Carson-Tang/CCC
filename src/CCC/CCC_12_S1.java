package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '12 S1 - Don't pass me the ball!
 * Carson Tang
 */
public class CCC_12_S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<4){
            System.out.println("0");
        } else {
            System.out.println((n-1)*(n-2)*(n-3)/6);
        }
    }
}