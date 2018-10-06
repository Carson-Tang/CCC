package CCC;

import java.io.*;
import java.util.*;
/*
 * CCC '15 J5 - π-day
 * Carson Tang
 */
public class CCC_15_J5 {
    static int [][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), k = Integer.parseInt(br.readLine());
        dp = new int[n+1][n+1][n+1];
        if(k==1){
            System.out.println(1);
        } else {
            System.out.println(recur(1,n,k));
        }
    }
    public static int recur (int min, int n, int k){
        if(n==0&&k==0) return 1;
        if(n==0||k==0) return 0;
        if(dp[min][n][k]==0) {
            int way = 0;
            for (int i = min; i <= n/k; i++) {
                way += recur(i, n - i, k - 1);
            }
            dp[min][n][k] = way;
        }
        return dp[min][n][k];
    }
}