package CCC;
import java.io.*;
import java.util.*;
/*
 * CCC '18 S3 - RoboThieves
 * Carson Tang
 */
public class CCC_18_S3 {
    public static boolean a = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        String s;
        ArrayList<Integer> emptycell = new ArrayList<>();
        char[][] grid = new char[n][m];
        Map<String, Integer> z = new HashMap<>();
        Map<Integer, String> z2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            for (int k = 0; k < m; k++) {
                grid[i][k] = s.charAt(k);
                z.put(Integer.toString(i) + "-" + Integer.toString(k), z.size());
                z2.put(z.size(), Integer.toString(i) + "-" + Integer.toString(k));
                if (grid[i][k] == '.') {
                    emptycell.add(z.get(Integer.toString(i) + "-" + Integer.toString(k)));
                }
            }
        }
        ArrayList<Integer>[] x = new ArrayList[n * m];
        for (int i = 0; i < n * m; i++) {
            x[i] = new ArrayList<>();
        }
        int start = -1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                if (grid[i][k] == 'C') {
                    for (int j = i; j < n; j++) {
                        if (cameraV(j, k, grid)) {
                            grid[j][k] = 'w';
                        } else if (grid[j][k] == 'W') {
                            break;
                        }
                    }
                    for (int j = i; j >= 0; j--) {
                        if (cameraV(j, k, grid)) {
                            grid[j][k] = 'w';
                        } else if (grid[j][k] == 'W') {
                            break;
                        }
                    }
                    for (int j = k; j < m; j++) {
                        if (cameraV(i, j, grid)) {
                            grid[i][j] = 'w';
                        } else if (grid[i][j] == 'W') {
                            break;
                        }
                    }
                    for (int j = k; j >= 0; j--) {
                        if (cameraV(i, j, grid)) {
                            grid[i][j] = 'w';
                        } else if (grid[i][j] == 'W') {
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                if (grid[i][k] == 'S') {
                    start = z.get(Integer.toString(i) + "-" + Integer.toString(k));
                }
                if (grid[i][k] == '.' || grid[i][k] == 'S') {
                    if (validP(i - 1, k, n, m)) {
                        if (grid[i - 1][k] != 'W' && grid[i - 1][k] != 'w' && grid[i-1][k]!='D') {
                            if (isConvey(grid, z2, z.get(Integer.toString(i-1) + "-" + Integer.toString(k)))) {
                                followConvey(x,grid,z,i-1,k,i,k,n,m);
                            } else {
                                x[z.get(Integer.toString(i) + "-" + Integer.toString(k))].add(z.get(Integer.toString(i - 1) + "-" + Integer.toString(k)));
                            }
                        }
                    }
                    if (validP(i + 1, k, n, m)) {
                        if (grid[i + 1][k] != 'W' && grid[i + 1][k] != 'w' && grid[i+1][k]!='U') {
                            if (isConvey(grid, z2, z.get(Integer.toString(i+1) + "-" + Integer.toString(k)))) {
                                followConvey(x,grid,z,i+1,k,i,k,n,m);
                            } else {
                                x[z.get(Integer.toString(i) + "-" + Integer.toString(k))].add(z.get(Integer.toString(i + 1) + "-" + Integer.toString(k)));
                            }
                        }
                    }
                    if (validP(i, k + 1, n, m)) {
                        if (grid[i][k + 1] != 'W' && grid[i][k + 1] != 'w' && grid[i][k+1]!='L') {
                            if (isConvey(grid, z2, z.get(Integer.toString(i) + "-" + Integer.toString(k+1)))) {
                                followConvey(x,grid,z,i,k+1,i,k,n,m);
                            } else {
                                x[z.get(Integer.toString(i) + "-" + Integer.toString(k))].add(z.get(Integer.toString(i) + "-" + Integer.toString(k + 1)));
                            }
                        }
                    }
                    if (validP(i, k - 1, n, m)) {
                        if (grid[i][k - 1] != 'W' && grid[i][k - 1] != 'w' && grid[i][k-1]!='R') {
                            if (isConvey(grid, z2, z.get(Integer.toString(i) + "-" + Integer.toString(k-1)))) {
                                followConvey(x,grid,z,i,k-1,i,k,n,m);
                            } else {
                                x[z.get(Integer.toString(i) + "-" + Integer.toString(k))].add(z.get(Integer.toString(i) + "-" + Integer.toString(k - 1)));
                            }
                        }
                    }

                }
            }
        }
        //System.out.println(Arrays.toString(x));
        Collections.sort(emptycell);
        if (a) {
            for (int i = 0; i < emptycell.size(); i++) {
                System.out.println(-1);
            }
        } else {
            bfs(n * m, x, start, emptycell);
        }
    }

    public static void followConvey(ArrayList<Integer>[] x, char[][] grid, Map<String,Integer> z, int i, int k, int parentx, int parenty, int r, int c) {
        if(grid[i][k]=='.' || grid[i][k]=='S'){
            x[z.get(Integer.toString(parentx)+"-"+Integer.toString(parenty))].add(z.get(Integer.toString(i)+"-"+Integer.toString(k)));
        } else if(grid[i][k]=='U'){
            if(validP(i-1,k,r,c)){
                if(grid[i-1][k]!='D'){
                    followConvey(x,grid,z,i-1,k,parentx,parenty,r,c);
                }
            }
        } else if (grid[i][k]=='D'){
            if(validP(i+1,k,r,c)){
                if(grid[i+1][k]!='D'){
                    followConvey(x,grid,z,i+1,k,parentx,parenty,r,c);
                }
            }
        } else if (grid[i][k]=='R'){
            if(validP(i,k+1,r,c)){
                if(grid[i][k+1]!='L'){
                    followConvey(x,grid,z,i,k+1,parentx,parenty,r,c);
                }
            }
        } else if (grid[i][k]=='L'){
            if(validP(i,k-1,r,c)){
                if(grid[i][k-1]!='R'){
                    followConvey(x,grid,z,i,k-1,parentx,parenty,r,c);
                }
            }
        }
    }

    public static void bfs(int length, ArrayList<Integer>[] x, int start, ArrayList<Integer> emptycell) {
        LinkedList<Integer> q = new LinkedList<>();
        int e;
        int[] dis = new int[length];
        boolean[] visited = new boolean[length];
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            e = q.remove();
            for (int i = 0; i < x[e].size(); i++) {
                if (!visited[x[e].get(i)]) {
                    q.add(x[e].get(i));
                    visited[x[e].get(i)] = true;
                    dis[x[e].get(i)] = dis[e] + 1;
                }
            }
        }
        for (int i = 0; i< emptycell.size(); i++) {
            if (dis[emptycell.get(i)] == 0) {
                System.out.println(-1);
            } else {
                System.out.println(dis[emptycell.get(i)]);
            }
        }
    }
    public static boolean isConvey(char[][] grid, Map<Integer, String> z2, int e) {
        e++;
        String[] tok = z2.get(e).split("-");
        int x = Integer.parseInt(tok[0]);
        int y = Integer.parseInt(tok[1]);
        if (grid[x][y] == 'U') {
            return true;
        }
        if (grid[x][y] == 'D') {
            return true;
        }
        if (grid[x][y] == 'R') {
            return true;
        }
        if (grid[x][y] == 'L') {
            return true;
        }
        return false;
    }

    public static boolean cameraV(int j, int k, char[][] grid) {
        if (grid[j][k] == 'S') {
            a = true;
        }
        if (grid[j][k] != '.') {
            return false;
        }
        return true;
    }

    public static boolean validP(int x, int y, int r, int c) {
        if (x < 0 || y < 0) {
            return false;
        }
        if (x > r - 1 || y > c - 1) {
            return false;
        }
        return true;
    }
}