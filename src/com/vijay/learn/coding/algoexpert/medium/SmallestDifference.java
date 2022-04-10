package com.vijay.learn.coding.algoexpert.medium;

import java.util.Arrays;

public class SmallestDifference {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);

    int len1 = arrayOne.length;
    int len2 = arrayTwo.length;
    int i=0;
    int j=0;
    int diff = Integer.MAX_VALUE;
    int minDiff = Integer.MAX_VALUE;
    int[] minDiffPair = new int[2];
    while (i<len1 && j<len2) {
      int num1 = arrayOne[i];
      int num2 = arrayTwo[j];

      if (num1 < num2) {
        diff = num2 - num1;
        i++;
      }
      else if (num2 < num1) {
        diff = num1 - num2;
        j++;
      }
      else {
        return new int[] {num1, num2};
      }

      if (minDiff > diff) {
        minDiff = diff;
        minDiffPair = new int[] {num1, num2};
      }
    }

    return minDiffPair;
  }
}
/*
Difficulty: Category: HiddenSuccessful Submissions: 54,593+

Smallest Difference
Write a function that takes in two non-empty arrays of integers, finds the
pair of numbers (one from each array) whose absolute difference is closest to
zero, and returns an array containing these two numbers, with the number from
the first array in the first position.
Note that the absolute difference of two integers is the distance between
them on the real number line. For example, the absolute difference of -5 and 5
is 10, and the absolute difference of -5 and -4 is 1.
You can assume that there will only be one pair of numbers with the smallest
difference.
Sample Input
arrayOne = [-1, 5, 10, 20, 28, 3]
arrayTwo = [26, 134, 135, 15, 17]
Sample Output
[28, 26]

HintsHint 1
Instead of generating all possible pairs of numbers, try somehow only looking at pairs that you know could actually have
the smallest difference. How can you accomplish this?
Hint 2
Would it help if the two arrays were sorted? If the arrays were sorted and you were looking at a given pair of numbers,
could you efficiently find the next pair of numbers to look at? What are the runtime implications of sorting the arrays?
Hint 3
Start by sorting both arrays, as per Hint #2. Put a pointer at the beginning of both arrays and evaluate the absolute
difference of the pointer-numbers. If the difference is equal to zero, then you've found the closest pair; otherwise,
increment the pointer of the smaller of the two numbers to find a potentially better pair. Continue until you get a pair
with a difference of zero or until one of the pointers gets out of range of its array.

Optimal Space & Time ComplexityO(nlog(n) + mlog(m)) time | O(1) space - where n is the length of the first input array
and m is the length of the second input array
 */