package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution1162 {
    int[][] grid;
    int[][] dist;
    boolean[][] visited;
    Queue<Point> points;
    
    class Point{
        public int i;
        public int j;
        
        public Point(int i, int j) {
            super();
            this.i = i;
            this.j = j;
        }
    }
    
    public int maxDistance(int[][] grid) {
        this.grid = grid;
        points = new LinkedList<Point>();
        int rl = grid.length;
        int cl = grid[0].length;
        
        dist = new int[rl][cl];
        for (int[] nums : dist) {
            Arrays.fill(nums, Integer.MAX_VALUE);
        }
        
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]==1) {
                    visited = new boolean[rl][cl];
                    calcDFS(i, j);
                }
            }
        }
        
        int maxd = 0;
        for (var nums : dist) {
            for (var n : nums) {
                //System.out.print(n + " ");
                maxd = maxd<n ? n : maxd;
            }
            //System.out.println();
        }
        if (maxd==Integer.MAX_VALUE || maxd==0) {
            maxd = -1;
        }
        return maxd;
    }

    private void calcDFS(int i, int j) {
        int rl = grid.length;
        int cl = grid[0].length;
        points.offer(new Point(i, j));
        visited[i][j] = true;
        
        int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        while(!points.isEmpty()) {
            Point p = points.poll();
            int d = Math.abs(p.i-i)+Math.abs(p.j-j);
            if (dist[p.i][p.j]>d) {
                dist[p.i][p.j]=d;
            }
            else {
                continue;
            }
            
            for (int k=0; k<4; k++) {
                int ti = p.i+dir[k][0];
                int tj = p.j+dir[k][1];
                if (0<=ti && ti<rl && 0<=tj && tj<cl) {
                    if (!visited[ti][tj]) {
                        points.offer(new Point(ti,tj));
                        visited[ti][tj] = true;
                    }
                }
            }
        }
    }
}

public class Q1162_As_Far_from_Land_as_Possible {
    public static void main(String[] args) {
        Solution1162 s = new Solution1162();
        int[][] nums = {{1,0,1},{0,0,0},{1,0,1}};
        int[][] nums2 = {{1,0,0},{0,0,0},{0,0,0}};
        System.out.println(s.maxDistance(nums2));
    }
}
