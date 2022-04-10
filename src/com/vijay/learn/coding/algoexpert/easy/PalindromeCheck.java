package com.vijay.learn.coding.algoexpert.easy;

public class PalindromeCheck {
  public static boolean isPalindrome(String str) {
    int j = str.length()-1;
    int i=0;

    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "abcdcba";
    isPalindrome(s);
  }
}

/*
Difficulty: Category: HiddenSuccessful Submissions: 60,942+Palindrome Check

Write a function that takes in a non-empty string and that returns a boolean
representing whether the string is a palindrome.
A palindrome is defined as a string that's written the same forward and
backward. Note that single-character strings are palindromes.
Sample Input
string = "abcdcba"
Sample Output
true // it's written the same forward and backward

Hints
Hint 1
Start by building the input string in reverse order and comparing this newly built string to the input string. Can you
do this without using string concatenations?

Hint 2
Can you optimize your algorithm by using recursion? What are the implications of recursion on an algorithm's space-time
complexity analysis?

Hint 3
Go back to an iterative solution and try using pointers to solve this problem: start with a pointer at the first index
of the string and a pointer at the final index of the string. What can you do from there?

Optimal Space & Time ComplexityO(n) time | O(1) space - where n is the length of the input string
 */
