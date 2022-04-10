package com.vijay.learn.coding.premium.easy;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
  public boolean generateDocument(String characters, String document) {
    int length = characters.length();
    int dLen = document.length();
    Map<Character, Integer> countMap = new HashMap<>();

    for (int i=0; i<length; i++) {
      char ch = characters.charAt(i);
      if (countMap.containsKey(ch)) {
        countMap.put(ch, countMap.get(ch)+1);
      }
      else {
        countMap.put(ch, 1);
      }
    }

    for (int i=0; i<dLen; i++) {
      char ch = document.charAt(i);
      if (countMap.containsKey(ch)) {
        if (countMap.get(ch) == 0) {
          return false;
        }
        countMap.put(ch, countMap.get(ch)-1);
      }
      else {
        return false;
      }
    }
    return true;
  }
}

/*
You're given a string of available characters and a string representing a
document that you need to generate. Write a function that determines if you
can generate the document using the available characters. If you can generate
the document, your function should return true; otherwise, it
should return false.
You're only able to generate the document if the frequency of unique
characters in the characters string is greater than or equal to the frequency
of unique characters in the document string. For example, if you're given
characters = "abcabc" and document = "aabbccc" you
cannot generate the document because you're missing one c.
The document that you need to create may contain any characters, including
special characters, capital letters, numbers, and spaces.
Note: you can always generate the empty string ("").
Sample Input
characters = "Bste!hetsi ogEAxpelrt x "
document = "AlgoExpert is the Best!"
Sample Output
true

 */