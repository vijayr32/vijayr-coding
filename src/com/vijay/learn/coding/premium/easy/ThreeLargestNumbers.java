package com.vijay.learn.coding.premium.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class ThreeLargestNumbers {
  public static int[] findThreeLargestNumbers(int[] array) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(3);
    for (int e : array) {
      if (minHeap.size() <3) {
        minHeap.add(e);
      }
      else {
        if (minHeap.peek() < e) {
          minHeap.remove();
          minHeap.add(e);
        }
      }
    }
    int[] res = new int[3];
    res[0] = minHeap.isEmpty() ? 0 : minHeap.poll();
    res[1] = minHeap.isEmpty() ? 0 : minHeap.poll();
    res[2] = minHeap.isEmpty() ? 0 : minHeap.poll();
    return res;
  }
}

/*
Write a function that takes in an array of at least three integers and,
without sorting the input array, returns a sorted array of the three largest
integers in the input array.
The function should return duplicate integers if necessary; for example, it
should return [10, 10, 12] for an input array of
[10, 5, 9, 10, 12].
Sample Input
array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
Sample Output
[18, 141, 541]

 */