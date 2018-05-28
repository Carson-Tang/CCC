package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '01 J2 - Mod Inverse
 * Carson Tang
 */
public class CCC_01_J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i < 100; i++) {
            if((n*i)%x==1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("No such integer exists.");
    }
}