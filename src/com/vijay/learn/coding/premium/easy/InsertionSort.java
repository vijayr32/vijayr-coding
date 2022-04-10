package com.vijay.learn.coding.premium.easy;

public class InsertionSort {
  public static int[] insertionSort(int[] array) {
    for (int i=1; i<array.length; i++) {
      int temp = array[i];
      int j = i-1;
      while (j >= 0 && array[j] > temp) {
        array[j+1] = array[j];
        j--;
      }
      array[j+1] = temp;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{8, 5, 2, 9, 5, 6, 3};
    insertionSort(arr);
  }
}

/*
Write a function that takes in an array of integers and returns a sorted
version of that array. Use the Insertion Sort algorithm to sort the array.
If you're unfamiliar with Insertion Sort, we recommend watching the Conceptual
Overview section of this question's video explanation before starting to code.
Sample Input
array = [8, 5, 2, 9, 5, 6, 3]
Sample Output
[2, 3, 5, 5, 6, 8, 9]

 */
