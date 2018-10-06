package CCC;

import java.io.*;
import java.util.*;

/*
 * CCC '17 S3 - Nailed It!
 * Carson Tang
 */
public class CCC_17_S3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[2001];
        int [] len = new int[4001];
        String [] tok = br.readLine().split(" ");
        for(int i = 0; i < n; i++) arr[Integer.parseInt(tok[i])]++;
        for(int i = 1; i < 2001; i++){
            if(arr[i]>0) {
                for (int j = i; j < 2001; j++) {
                    if (i == j) {
                        len[i*2] += arr[i]/2;
                    } else if (arr[j]>0){
                        len[i+j] += Math.min(arr[i],arr[j]);
                    }
                }
            }
        }
        int longest = 0;
        for(int i = 1; i < 4001; i++) longest = Math.max(longest,len[i]);
        int diffh = 0;
        for(int i = 1; i < 4001; i++) if(len[i]==longest) diffh++;
        System.out.printf("%d %d",longest,diffh);
    }
}