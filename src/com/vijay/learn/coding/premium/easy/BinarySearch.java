package com.vijay.learn.coding.premium.easy;

public class BinarySearch {
  public static int binarySearch(int[] array, int target) {
    return binarySearch(array, 0, array.length-1, target);
  }

  public static int binarySearch(int[] array, int start, int end, int target) {
    if (start > end) {
      return -1;
    }
    int mid = (start+end)/2;
    if (array[mid] == target) {
      return mid;
    }
    if (array[mid] < target) {
      return binarySearch(array, mid+1, end, target);
    }
    return binarySearch(array, start, mid-1, target);
  }
}

/*
Write a function that takes in a sorted array of integers as well as a target
integer. The function should use the Binary Search algorithm to determine if
the target integer is contained in the array and should return its index if it
is, otherwise -1.
If you're unfamiliar with Binary Search, we recommend watching the Conceptual
Overview section of this question's video explanation before starting to code.
Sample Input
array = [0, 1, 21, 33, 45, 45, 61, 71, 72, 73]
target = 33
Sample Output
3
 */