package com.vijay.learn.coding.premium.easy;

public class RunLengthEncoding {
  public static String runLengthEncoding(String string) {

    StringBuilder sb = new StringBuilder();
    int length = string.length();

    int count = 0;
    int i=0;
    for (i=0; i<length-1; i++) {
      if (string.charAt(i) == string.charAt(i+1)) {
        count++;
      }
      else {
        count += 1;
        while (count > 9) {
          sb.append(9);
          sb.append(string.charAt(i));
          count -= 9;
        }
        sb.append(count);
        sb.append(string.charAt(i));
        count = 0;
      }
    }

    if (count == 0) {
      sb.append(1);
      sb.append(string.charAt(i));
    }
    else {
      count += 1;
      while (count > 9) {
        sb.append(9);
        sb.append(string.charAt(i));
        count -= 9;
      }
      sb.append(count);
      sb.append(string.charAt(i));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String s = "AAAAAAAAAAAAABBCCCCD";
    runLengthEncoding(s);
  }
}

/*
Difficulty: Category: HiddenSuccessful Submissions: 30

Run-Length Encoding

Write a function that takes in a non-empty string and returns its run-length
encoding.
From Wikipedia, "run-length encoding is a form of lossless data compression in
which runs of data are stored as a single data value and count, rather than as
the original run." For this problem, a run of data is any sequence of
consecutive, identical characters. So the run "AAA" would be
run-length-encoded as "3A".
To make things more complicated, however, the input string can contain all
sorts of special characters, including numbers. And since encoded data must be
decodable, this means that we can't naively run-length-encode long runs. For
example, the run "AAAAAAAAAAAA" (12 As), can't
naively be encoded as "12A", since this string can be decoded as
either "AAAAAAAAAAAA" or "1AA". Thus, long runs (runs
of 10 or more characters) should be encoded in a split fashion; the
aforementioned run should be encoded as "9A3A".
Sample Input
string = "AAAAAAAAAAAAABBCCCCDD"
Sample Output
"9A4A2B4C2D"

Hints
Hint 1
Traverse the input string and count the length of each run. As you traverse the string, what should you do when you
reach a run of length 9 or the end of a run?

Hint 2
When you reach a run of length 9 or the end of a run, store the computed count for the run as well as its character
(you'll likely need a list for these computed counts and characters), and reset the count to 1 before continuing to
traverse the string.

Hint 3
Make sure that your solution correctly handles the last run in the string.
Optimal Space & Time ComplexityO(n) time | O(n) space - where n is the length of the input string
 */