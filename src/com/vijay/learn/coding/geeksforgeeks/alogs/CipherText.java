package com.vijay.learn.coding.geeksforgeeks.alogs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CipherText {

  public static Map<Integer, Character> mapUpper = new HashMap<>();
  public static Map<Integer, Character> mapLower = new HashMap<>();

  public static void encrypt(int n, String s, int k) {

    StringBuilder sb = new StringBuilder();

    for (int i=0; i<n; i++) {

      if (s.charAt(i) < 95) {
        int key = s.charAt(i)-65;
        key = (key+k) %26;
        sb.append(mapUpper.get(key));
      }
      else {
        int key = s.charAt(i)-92;
        key = (key+k) %26;
        sb.append(mapUpper.get(key));
      }
    }

    System.out.println(sb.toString());
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.nextLine();
    int k = sc.nextInt();

    mapLower.put(0, 'a');
    mapLower.put(1, 'b');
    mapLower.put(2, 'c');
    mapLower.put(3, 'd');
    mapLower.put(4, 'e');
    mapLower.put(5, 'f');
    mapLower.put(6, 'g');
    mapLower.put(7, 'h');
    mapLower.put(8, 'i');
    mapLower.put(9, 'j');
    mapLower.put(10, 'k');
    mapLower.put(11, 'l');
    mapLower.put(12, 'm');
    mapLower.put(13, 'n');
    mapLower.put(14, 'o');
    mapLower.put(15, 'p');
    mapLower.put(16, 'q');
    mapLower.put(17, 'r');
    mapLower.put(18, 'w');
    mapLower.put(19, 't');
    mapLower.put(20, 'u');
    mapLower.put(21, 'v');
    mapLower.put(22, 'w');
    mapLower.put(23, 'x');
    mapLower.put(24, 'y');
    mapLower.put(25, 'z');



    mapUpper.put(0, 'A');
    mapUpper.put(1, 'B');
    mapUpper.put(2, 'C');
    mapUpper.put(3, 'D');
    mapUpper.put(4, 'E');
    mapUpper.put(5, 'F');
    mapUpper.put(6, 'G');
    mapUpper.put(7, 'H');
    mapUpper.put(8, 'I');
    mapUpper.put(9, 'J');
    mapUpper.put(10, 'K');
    mapUpper.put(11, 'L');
    mapUpper.put(12, 'M');
    mapUpper.put(13, 'N');
    mapUpper.put(14, 'O');
    mapUpper.put(15, 'P');
    mapUpper.put(16, 'Q');
    mapUpper.put(17, 'R');
    mapUpper.put(18, 'S');
    mapUpper.put(19, 'T');
    mapUpper.put(20, 'U');
    mapUpper.put(21, 'V');
    mapUpper.put(22, 'W');
    mapUpper.put(23, 'X');
    mapUpper.put(24, 'Y');
    mapUpper.put(25, 'Z');

  }
}
