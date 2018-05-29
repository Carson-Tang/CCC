package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '13 J2 - Rotating letters
 * Carson Tang
 */
public class CCC_13_J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        for(int i = 0; i < t.length(); i++) {
            if (!String.valueOf(t.charAt(i)).equals("I") && !String.valueOf(t.charAt(i)).equals("O") &&
                    !String.valueOf(t.charAt(i)).equals("S") && !String.valueOf(t.charAt(i)).equals("H") &&
                    !String.valueOf(t.charAt(i)).equals("X") && !String.valueOf(t.charAt(i)).equals("Z") &&
                    !String.valueOf(t.charAt(i)).equals("N")) {
                System.out.print("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}