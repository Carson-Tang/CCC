package CCC;
import java.io.*;
import java.util.*;
/*
 * CCCHK '15 J1 - Rock-paper-scissors
 * Carson Tang
 */
public class CCCHK_15_J1 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] tokens1 = br.readLine().split(" ");
        String [] tokens2 = br.readLine().split(" ");
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < n; i++) {
            if(tokens1[i].equals("rock")) {
                if(tokens2[i].equals("paper")){
                    b++;
                } else if (tokens2[i].equals("scissors")) {
                    a++;
                }
            } else if (tokens1[i].equals("paper")) {
                if(tokens2[i].equals("scissors")){
                    b++;
                } else if (tokens2[i].equals("rock")){
                    a++;
                }
            } else if (tokens1[i].equals("scissors")) {
                if(tokens2[i].equals("rock")){
                    b++;
                }else if (tokens2[i].equals("paper")){
                    a++;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}