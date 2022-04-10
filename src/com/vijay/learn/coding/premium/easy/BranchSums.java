package com.vijay.learn.coding.premium.easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> result = new ArrayList<>();
    branchSums(root, result, 0);
    return result;
  }

  public static void branchSums(BinaryTree root, List<Integer> result, int sum) {
    if (root.left == null && root.right == null) {
      result.add(sum+root.value);
      return;
    }
    if (root.left != null) {
      branchSums(root.left, result, sum+root.value);
    }
    if (root.right != null) {
      branchSums(root.right, result, sum+root.value);
    }
  }

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree(1);
    bt.left = new BinaryTree(2);
    bt.right = new BinaryTree(3);
    bt.left.left = new BinaryTree(4);
    bt.left.right = new BinaryTree(5);
    bt.right.left = new BinaryTree(6);
    bt.right.right = new BinaryTree(7);
    bt.left.left.left = new BinaryTree(8);
    bt.left.left.right = new BinaryTree(9);
    bt.left.right.left = new BinaryTree(10);
    branchSums(bt);
  }
}

/*
Branch Sums

  Write a function that takes in a Binary Tree and returns a list of its branch
  sums ordered from leftmost branch sum to rightmost branch sum.

  A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree
  branch is a path of nodes in a tree that starts at the root node and ends at
  any leaf node.

  Each BinaryTree node has an integer value, a
  left child node, and a right child node. Children
  nodes can either be BinaryTree nodes themselves or
  None / null.

Sample Input
tree =     1
        /     \
       2       3
     /   \    /  \
    4     5  6    7
  /   \  /
 8    9 10

Sample Output
[15, 16, 18, 10, 11]
// 15 == 1 + 2 + 4 + 8
// 16 == 1 + 2 + 4 + 9
// 18 == 1 + 2 + 5 + 10
// 10 == 1 + 3 + 6
// 11 == 1 + 3 + 7

HintsHint 1
Try traversing the Binary Tree in a depth-first-search-like fashion.

Hint 2

Recursively traverse the Binary Tree in a depth-first-search-like fashion, and pass a running sum of the values of every previously-visited node to each node that you're traversing.

Hint 3

As you recursively traverse the tree, if you reach a leaf node (a node with no "left" or "right" Binary Tree nodes), add the relevant running sum that you've calculated to a list of sums (which you'll also have to pass to the recursive function). If you reach a node that isn't a leaf node, keep recursively traversing its children nodes, passing the correctly updated running sum to them.
Optimal Space & Time ComplexityO(n) time | O(n) space - where n is the number of nodes in the Binary Tree
 */