package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '15 J1 - Special Day
 * Carson Tang
 */
public class CCC_15_J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(month == 2 && day == 18) {
            System.out.println("Special");
        } else if (month==2) {
            if(day>18) {
                System.out.println("After");
            } else {
                System.out.println("Before");
            }
        } else if (month>2) {
            System.out.println("After");
        } else {
            System.out.println("Before");
        }
    }
}