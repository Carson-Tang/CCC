package CCC;

import java.io.*;
import java.util.*;

/*
 * CCC '05 S5 - Pinball Ranking
 * Carson Tang
 */
public class CCC_05_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long [] bit = new long[n+2];
        long [] smol = new long[n+1];
        long [] arr = new long[n+1];
        for(int i =0; i < n; i++){
            arr[i]=smol[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(smol);
        double t = 0;
        for(int i = 0; i < n; i++){
            long r = arr[i];
            int k = Arrays.binarySearch(smol,r);
            t += (double)((i+1) - sum(bit,k+1))/n;
            update(bit,1,k+1,n);
        }
        System.out.printf("%.2f",t);
    }
    public static int sum(long [] bit, int ind){
        int tot = 0;
        while(ind>0){
            tot += bit[ind];
            ind -= ind & (-ind);
        }
        return tot;
    }
    public static void update(long [] bit, int val, int ind, int n){
        while(ind<=n){
            bit[ind] += val;
            ind += ind & (-ind);
        }
    }
}