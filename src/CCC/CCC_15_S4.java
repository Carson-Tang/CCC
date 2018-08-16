package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '15 S4 - Convex Hull
 * Carson Tang
 */
public class CCC_15_S4 {
    static class edge implements Comparable<edge>{
        int dest,time,hull;
        edge(int dest, int time, int hull){
            this.dest=dest;
            this.time=time;
            this.hull=hull;
        }
        public int compareTo(edge a){
            if(this.time>a.time) return 1;
            if(this.time<a.time) return -1;
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int k = Integer.parseInt(tok[0]), n = Integer.parseInt(tok[1]), m = Integer.parseInt(tok[2]);
        ArrayList<edge> [] x = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) x[i]=new ArrayList<>();
        for(int i = 0; i < m; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = Integer.parseInt(tok2[0]), b = Integer.parseInt(tok2[1]), t = Integer.parseInt(tok2[2]), h = Integer.parseInt(tok2[3]);
            x[a].add(new edge(b,t,h));
            x[b].add(new edge(a,t,h));
        }
        String [] tok2 = br.readLine().split(" ");
        int start = Integer.parseInt(tok2[0]), end = Integer.parseInt(tok2[1]);
        int [][] dis = new int[n+1][k+1];
        for(int [] a : dis) Arrays.fill(a,9999999);
        boolean [] vis = new boolean[n+1];
        vis[start]=true;
        dis[start][0]=0;
        PriorityQueue<edge> q = new PriorityQueue<>();
        q.add(new edge(start,0,0));
        while(!q.isEmpty()){
            edge a = q.poll();
            int e = a.dest;
            vis[e]=false;
            for(int i = 0; i < x[e].size(); i++){
                for(int j = 0; j < k - x[e].get(i).hull; j++){
                    if(dis[x[e].get(i).dest][j+x[e].get(i).hull]>dis[e][j] + x[e].get(i).time){
                        dis[x[e].get(i).dest][j+x[e].get(i).hull]=dis[e][j] + x[e].get(i).time;
                        if(!vis[x[e].get(i).dest]) {
                            q.add(new edge(x[e].get(i).dest, x[e].get(i).time, x[e].get(i).hull));
                            vis[x[e].get(i).dest]=true;
                        }
                    }
                }
            }
        }
        int min = 9999999;
        for(int i = 0; i < k+1; i++){
            if(dis[end][i]<min){
                min=dis[end][i];
            }
        }
        if(min==9999999) System.out.println(-1);
        else System.out.println(min);
    }
}
