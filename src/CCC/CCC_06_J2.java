package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '06 J2 - Roll the Dice
 * Carson Tang
 */
public class CCC_06_J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int w = 0;
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= b; j++) {
                if(i+j==10) {
                    w++;
                }
            }
        }
        if(w == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        } else {
            System.out.println("There are " + w + " ways to get the sum 10.");
        }
    }
}