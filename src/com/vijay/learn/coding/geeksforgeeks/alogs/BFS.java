package com.vijay.learn.coding.geeksforgeeks.alogs;

import java.util.*;

public class BFS {
  public static List<List<Integer>> adjList = new ArrayList<>();
  private static final int N=5;
  public void bfs(int v) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[N];
    queue.add(v);

    while (!queue.isEmpty()) {
      int s = queue.poll();
      visited[s] = true;
      System.out.println(s + "  ");
      Iterator itr = adjList.get(s).listIterator();
      while (itr.hasNext()) {
        int u = (int) itr.next();
        if (!visited[u]) {
          queue.add(u);
        }
      }
    }
  }
}
