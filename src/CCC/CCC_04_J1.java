package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '04 J1 - Squares
 * Carson Tang
 */
public class CCC_04_J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        a = Math.sqrt(a);
        int b = (int)a;
        System.out.println("The largest square has side length " + b + ".");
    }
}