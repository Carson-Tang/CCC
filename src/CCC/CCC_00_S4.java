package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '00 S4 - Golf
 * Carson Tang
 */
public class CCC_00_S4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> [] x = new ArrayList[5281];
        for(int i = 0; i <= 5280; i++){
            x[i] = new ArrayList<>();
        }
        int dis = Integer.parseInt(br.readLine());
        int clubs = Integer.parseInt(br.readLine());
        int [] club = new int[clubs];
        for(int i = 0; i< clubs; i++){
            club[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(club);
        int e,v;
        int [] strokes = new int[5281];
        boolean [] visited = new boolean[5281];
        boolean a = true;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()) {
            e=q.remove();
            for (int i = 0; a && i < club.length; i++) {
                v = e+club[i];
                if(v>=5281){
                    a=false;
                    break;
                }
                if (!visited[v]) {
                    x[e].add(v);
                    visited[v] = true;
                    q.add(v);
                    strokes[v]=strokes[e]+1;
                }
            }
        }
        if(!visited[dis]){
            System.out.println("Roberta acknowledges defeat.");
        } else {
            System.out.println("Roberta wins in " + strokes[dis] + " strokes.");
        }
    }
}
