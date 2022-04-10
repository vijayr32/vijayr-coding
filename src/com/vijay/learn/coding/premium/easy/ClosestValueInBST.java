package com.vijay.learn.coding.premium.easy;

public class ClosestValueInBST {
  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBst(tree, target, tree.value);
  }

  public static int findClosestValueInBst(BST tree, int target, int closest) {
    if (Math.abs(target - closest) > Math.abs(target-tree.value)) {
      closest = tree.value;
    }

    if (tree.value > target && tree.left != null) {
      return findClosestValueInBst(tree.left, target, closest);
    }
    else if (tree.value < target && tree.right != null) {
      return findClosestValueInBst(tree.right, target, closest);
    }
    else {
      return closest;
    }
  }

  public static void main(String[] args) {
    BST tree = new BST(10);
    tree.left = new BST(5);
    tree.right = new BST(15);
    tree.left.left = new BST(2);
    tree.left.right = new BST(5);
    tree.right.left = new BST(13);
    tree.right.right = new BST(22);
    tree.left.left.left = new BST(1);
    tree.right.left.right = new BST(14);

    System.out.println(findClosestValueInBst(tree, 12));
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}

/*
Difficulty: Category: HiddenSuccessful Submissions: 61,842+Find Closest Value In BST

  Write a function that takes in a Binary Search Tree (BST) and a target integer
  value and returns the closest value to that target value contained in the BST.

You can assume that there will only be one closest value.

  Each BST node has an integer value, a
  left child node, and a right child node. A node is
  said to be a valid BST node if and only if it satisfies the BST
  property: its value is strictly greater than the values of every
  node to its left; its value is less than or equal to the values
  of every node to its right; and its children nodes are either valid
  BST nodes themselves or None / null.

Sample Input
tree =   10
       /     \
      5       15
    /   \    /   \
   2     5  13    22
 /            \
1             14
target = 12

Sample Output
13

Hints

Hint 1
Try traversing the BST node by node, all the while keeping track of the node with the value closest to the target value.
Calculating the absolute value of the difference between a node's value and the target value should allow you to check
if that node is closer than the current closest one.

Hint 2

Make use of the BST property to determine what side of any given node has values close to the target value and is therefore worth exploring.

Hint 3

What are the advantages and disadvantages of solving this problem iteratively as opposed to recursively?
Optimal Space & Time ComplexityAverage: O(log(n)) time | O(1) space - where n is the number of nodes in the BST
Worst: O(n) time | O(1) space - where n is the number of nodes in the BST
 */