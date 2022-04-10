package com.vijay.learn.coding.premium.easy;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
  public static int sum = 0;
  public static int productSum(List<Object> array) {
    return productSum(array, 1, 0);
  }

  private static int productSum(List<Object> array, int depth, int i) {

    if (i<array.size()) {
      Object obj = array.get(i);
      if (array.get(i) instanceof Integer ) {
        sum += fact(depth)*((Integer) array.get(i)).intValue();
        productSum(array, depth, i+1);
      }
      if (array.get(i) instanceof List) {
        productSum((List<Object>) array.get(i), depth+1, 0);
        productSum(array, depth, i+1);
      }
    }
    return sum;
  }

  public static int fact(int n) {
    if (n==0 || n==1) {
      return 1;
    }
    return n*fact(n-1);
  }

  public static void main(String[] args) {
    List<Object> list = new ArrayList<>();
    List<Object> list1 = new ArrayList<>();
    List<Object> list2 = new ArrayList<>();
    List<Object> list3 = new ArrayList<>();
    List<Object> list4 = new ArrayList<>();
    list4.add(5);
    list3.add(list4);
    list2.add(list3);
    list1.add(list2);
    list.add(list1);
//    list.add(2);
//    List<Object> list1 = new ArrayList<>();
//    list1.add(7);
//    list1.add(-1);
//    list.add(list1);
//    List<Object> list2 = new ArrayList<>();
//    list.add(3);
//    list2.add(6);
//    List<Object> list3 = new ArrayList<>();
//    list3.add(-13);
//    list3.add(8);
//    list2.add(list3);
//    list2.add(4);
//    list.add(4);
//    list.add(5);
    System.out.printf(String.valueOf(productSum(list)));
  }
}

/*
Write a function that takes in a "special" array and returns its product sum.
A "special" array is a non-empty array that contains either integers or other
"special" arrays. The product sum of a "special" array is the sum of its
elements, where "special" arrays inside it are summed themselves and then
multiplied by their level of depth.
The depth of a "special" array is how far nested it is. For instance, the
depth of [] is 1; the depth of the inner array in
[[]] is 2; the depth of the innermost array in
[[[]]] is 3.
Therefore, the product sum of [x, y] is x + y; the
product sum of [x, [y, z]] is x + 2 * (y + z); the
product sum of [x, [y, [z]]] is x + 2 * (y + 3z).
Sample Input
array = [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
Sample Output
12 // calculated as: 5 + 2 + 2 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)

 */