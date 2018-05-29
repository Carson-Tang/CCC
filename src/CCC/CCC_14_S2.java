package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '14 S2 - Assigning Partners
 * Carson Tang
 */
public class CCC_14_S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Map <String, String> x = new HashMap<>();
        int n = Integer.parseInt(sc.readLine());
        if(n%2!=0){
            System.out.println("bad");
            System.exit(0);
        }
        String [] tok = sc.readLine().split(" ");
        String [] tok1 = sc.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            if(tok[i].equals(tok1[i])){
                System.out.println("bad");
                System.exit(0);
            }
            x.put(tok[i],tok1[i]);
        }
        String a;
        for(int i = 0; i < n; i++) {
            a = x.get(tok[i]);
            if(!x.get(a).equals(tok[i])) {
                System.out.println("bad");
                System.exit(0);
            }
        }
        System.out.println("good");
    }
}