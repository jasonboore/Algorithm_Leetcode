package leetcode.medium.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    boolean[] visited;
    int num;
    /**
     * 有向图深度优先遍历
     * @param rooms
     * @return
     */
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        visited = new boolean[n];
        num = 0;
        dfs(rooms, 0);
        return num == n;
    }
    public void dfs(List<List<Integer>> rooms, int roomNum) {
        visited[roomNum] = true;
        num++;
        for (Integer i : rooms.get(roomNum)) {
            if(!visited[i]) {
                dfs(rooms, i);
            }
        }
    }

    /**
     * 广度优先遍历
     * @param rooms
     * @return
     */
    public boolean canVisitAllRooms1(List<List<Integer>> rooms) {
        int num1 = 0, n = rooms.size();
        boolean[] vis = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;
        while (!queue.isEmpty()) {
            int roomNum = queue.poll();
            num1++;
            for (Integer i : rooms.get(roomNum)) {
                if(!vis[i]) {
                    vis[i] = true;
                    queue.add(i);
                }
            }
        }
        return num1 == n;
    }

    public static void main(String[] args) {

    }
}
