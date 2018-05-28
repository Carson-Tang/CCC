package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '11 S2 - Multiple Choice
 * Carson Tang
 */
public class CCC_11_S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int correct = 0;
        sc.nextLine();
        String [] answer = new String [n];
        for(int i = 0; i < n; i++) {
            answer[i] = sc.nextLine();
        }
        for(int k = 0; k < n ; k++) {
            String temp = sc.nextLine();
            if(temp.equals(answer[k])) {
                correct++;
            }
        }
        System.out.println(correct);
    }
}