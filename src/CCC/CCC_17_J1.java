package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '17 J1 - Quadrant Selection
 * Carson Tang
 */
public class CCC_17_J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0) {
            if(y>0){
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if(y>0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}