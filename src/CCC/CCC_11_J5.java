package CCC;

import java.io.*;
import java.util.*;
/*
 * CCC '11 J5 - Unfriend
 * Carson Tang
 */
public class CCC_11_J5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        boolean [] setofp;
        boolean [] set;
        ArrayList<Integer>[]x = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) x[i]=new ArrayList<>();
        for(int i = 1; i < n; i++) x[Integer.parseInt(br.readLine())].add(i);
        n-=1;
        for(int i = 0; i < (1<<n); i++){
            setofp = new boolean[n+1];
            set = new boolean[n+1];
            for(int j = 0; j < n; j++){
                if((i&(1<<j))>0){
                    setofp[j+1]=true;
                }
            }
            for(int j = 0; j < n+1; j++){
                if(setofp[j]){
                    set[j]=true;
                    for(int neigh : x[j]){
                        set[neigh]=true;
                    }
                }
            }
            if(Arrays.equals(set,setofp)) cnt++;
        }
        System.out.println(cnt);
    }
}