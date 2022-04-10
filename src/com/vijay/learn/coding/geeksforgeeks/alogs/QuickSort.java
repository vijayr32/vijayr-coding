package com.vijay.learn.coding.geeksforgeeks.alogs;

public class QuickSort {
  public static void quicksort(int[] arr) {
    quicksort(arr, 0, arr.length-1);
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
  }

  public static void quicksort(int[] arr, int start, int end) {
    if (start>=end) {
      return;
    }
    int pivot = end;
    int i=start-1;
    for (int j=start; j<end; j++) {
      if (arr[j] < arr[pivot]) {
        i++;
        swap(arr, i ,j);
      }
    }
    i++;
    swap(arr, i, pivot);
    quicksort(arr, start, i-1);
    quicksort(arr,i+1, end);
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{6, 3, 45, 8, 46, 7, 2, 59, 11};
    quicksort(arr);
  }
}