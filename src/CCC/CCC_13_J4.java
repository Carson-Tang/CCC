package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '13 J4 - Time on task
 * Carson Tang
 */
public class CCC_13_J4 {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        int c = Integer.parseInt(sc.readLine());
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < c; i++) {
            x.add(Integer.parseInt(sc.readLine()));
        }
        Collections.sort(x);
        Integer [] y = x.toArray(new Integer[x.size()]);
        int n =0;
        int a = 0;
        while(t-y[a]>=0){
            t-=y[a];
            n++;
            a++;
        }
        System.out.println(n);
    }
}