package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '09 J1 - ISBN
 * Carson Tang
 */
public class CCC_09_J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The 1-3-sum is " + (91 + a + b*3 + c));
    }
}