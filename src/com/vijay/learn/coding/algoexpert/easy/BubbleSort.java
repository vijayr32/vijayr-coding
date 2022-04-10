package com.vijay.learn.coding.algoexpert.easy;

public class BubbleSort {
  public static int[] bubbleSort(int[] array) {
    for (int i=0; i<array.length; i++) {
      for (int j=1; j<array.length-i; j++) {
        if (array[j-1] > array[j]) {
          int temp = array[j];
          array[j] = array[j-1];
          array[j-1] = temp;
        }
      }
    }
    return array;
  }
}

/*
Write a function that takes in an array of integers and returns a sorted
version of that array. Use the Bubble Sort algorithm to sort the array.
If you're unfamiliar with Bubble Sort, we recommend watching the Conceptual
Overview section of this question's video explanation before starting to code.
Sample Input
array = [8, 5, 2, 9, 5, 6, 3]
Sample Output
[2, 3, 5, 5, 6, 8, 9]

 */