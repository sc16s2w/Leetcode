package com.company.graphSearch;

import java.util.*;

public class Code_787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] store = new int[n][n];
        for (int[] flight : flights) {
            store[flight[0]][flight[1]] = flight[3];
        }
        boolean[][] used = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < store.length; i++) {
            if (store[src][i] != 0) {
                queue.add(new int[]{src, i, store[src][i]});
                used[src][i] = true;
                int stop = 0;
                int count = 0;
                while (!queue.isEmpty() && stop <= k) {
                    int length = queue.size();
                    while (length > 0) {
                        int[] temp = queue.poll();
                        count += temp[3];
                        if(temp[2]==dst){
                            result.add(count);
                        }
                        for (int j = 0; j < n; j++) {
                            if (store[temp[2]][j] != 0&&!used[temp[2]][j]) {
                                queue.add(new int[]{temp[2], j, store[temp[2]][j]});
                                used[temp[2]][j] = true;
                            }
                        }
                        length--;
                    }
                    stop++;
                }
            }
        }
        return Collections.min(result);
    }
}
