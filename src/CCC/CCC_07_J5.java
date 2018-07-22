package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '07 J5 - Keep on Truckin'
 * Carson Tang
 */
public class CCC_07_J5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> h = new ArrayList<>();
        h.add(0);
        h.add(990);
        h.add(1010);
        h.add(1970);
        h.add(2030);
        h.add(2940);
        h.add(3060);
        h.add(3930);
        h.add(4060);
        h.add(4970);
        h.add(5030);
        h.add(5990);
        h.add(6010);
        h.add(7000);
        for (int i = 0; i < n; i++) {
            h.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(h);
        int [] dis = new int[7001];
        LinkedList<Integer>q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int e = q.poll();
            for(int i = 1; i <= h.size()-1; i++){
                if(h.get(i)>=e){
                    if(h.get(i)-e>=a && h.get(i)-e<=b){
                        q.add(h.get(i));
                        dis[h.get(i)]++;
                    }
                }
            }
        }
        System.out.println(dis[7000]);
    }
}