package com.vijay.learn.coding.premium.medium;

public class LongestPeak {
  public static int longestPeak(int[] array) {
    if (array.length < 3) {
      return 0;
    }
    int[] inc = new int[array.length];
    inc[0] = 1;
    for (int i=1; i<array.length; i++) {
      if (array[i-1] < array[i]) {
        inc[i] = inc[i-1] + 1;
      }
      else {
        inc[i] = 1;
      }
    }

    int[] dec = new int[array.length];
    dec[array.length-1] = 1;
    for (int i=array.length-2; i>=0; i--) {
      if (array[i] > array[i+1]) {
        dec[i] = dec[i+1] + 1;
      }
      else {
        dec[i] = 1;
      }
    }

    int result = 0;
    for (int i=0; i<array.length; i++) {
      if (inc[i] > 1 && dec[i] > 1) {
        result = Math.max(result, inc[i]+dec[i]-1);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1,3,2};
    longestPeak(arr);
  }
}

/*
Difficulty: Category: HiddenSuccessful Submissions: 35,542+Longest Peak
Write a function that takes in an array of integers and returns the length of
the longest peak in the array.
A peak is defined as adjacent integers in the array that are strictly
increasing until they reach a tip (the highest value in the peak), at which
point they become strictly decreasing. At least three integers are required to
form a peak.
For example, the integers 1, 4, 10, 2 form a peak, but the
integers 4, 0, 10 don't and neither do the integers
1, 2, 2, 0. Similarly, the integers 1, 2, 3 don't
form a peak because there aren't any strictly decreasing integers after the
3.
Sample Input
array = [1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]

My approach
inc   = [1, 2, 3, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1]
dec   = [1, 1, 1, 1, 2, 1, 5, 4, 3, 2, 1, 1, 1]

Sample Output
6 // 0, 10, 6, 5, -1, -3
HintsHint 1
You can solve this question by iterating through the array from left to right once.
Hint 2
Iterate through the array from left to right, and treat every integer as the potential tip of a peak. To be the tip of a
peak, an integer has to be strictly greater than its adjacent integers. What can you do when you find an actual tip?
Hint 3
As you iterate through the array from left to right, whenever you find a tip of a peak, expand outwards from the tip
until you no longer have a peak. Given what peaks look like and how many peaks can therefore fit in an array, realize
that this process results in a linear-time algorithm. Make sure to keep track of the longest peak you find as you iterate through the array.
Optimal Space & Time ComplexityO(n) time | O(1) space - where n is the length of the input array
 */