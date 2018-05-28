package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '05 J3 - Returning Home
 * Carson Tang
 */
public class CCC_05_J3 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] x = new String[5];
        String [] y = new String[5];
        int i = 0;
        while(true) {
            x[i] = br.readLine();
            y[i] = br.readLine();
            if(y[i].equals("SCHOOL")){
                break;
            }
            i++;
        }
        for(int k = i; k > 0; k--) {
            if(x[k].equals("R")) {
                System.out.println("Turn LEFT onto " + y[k-1] + " street.");
            } else if (x[k].equals("L")){
                System.out.println("Turn RIGHT onto " + y[k-1] + " street.");
            }
        }
        if(x[0].equals("R")) {
            System.out.println("Turn LEFT into your HOME.");
        } else if (x[0].equals("L")){
            System.out.println("Turn RIGHT into your HOME.");
        }
    }
}