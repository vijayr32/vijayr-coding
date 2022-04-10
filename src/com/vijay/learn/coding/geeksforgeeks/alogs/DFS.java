package com.vijay.learn.coding.geeksforgeeks.alogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DFS {
  public static List<List<Integer>> adjList = new ArrayList<>();
  private static final int N=5;
  public static void dfs(int v) {
    boolean[] visited = new boolean[N];
    dfs(0, visited);
  }

  public static void dfs(int v, boolean visited[]) {
    visited[v] = true;
    System.out.println(v + "  ");
    Iterator itr = adjList.get(v).listIterator();
    while (itr.hasNext()) {
      int u = (int) itr.next();
      if (!visited[u]) {
        dfs(u, visited);
      }
    }
  }
}
