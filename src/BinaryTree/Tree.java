package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        private Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    //O(log n)
    public void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {

            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }

        }
    }//insert values in tree

    //O(Log n)
    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else return true;
        }
        return false;
    }//find a value in tree

    public void traversePreOrder() {
        traversePreOrder(root);
    }//pre order

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        //root (print)
        //left
        //right
        System.out.print(root.value + ",");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }//In order

    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        //root (print)
        //left
        //right

        traverseInOrder(root.leftChild);
        System.out.print(root.value + ",");
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }//post order

    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        //root (print)
        //left
        //right

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + ",");
    }

    private boolean isLeaf(Node n) {
        return n.leftChild == null && n.rightChild == null;
    }//checking if leaf is empty or not

    public int height() {
        return height(root);
    }//max height

    private int height(Node root) {
        if (root == null)
            return -1;
        if (isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.leftChild),
                height(root.rightChild));
    }

    //O(log n)
    public int min() {
        if (root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    public int minimum() {
        return minimum(root);
    }//minimum number in the tree

    //O(n)
    private int minimum(Node root) {
        if (root == null) return -1;
//        System.out.println(isLeaf(root));
//        System.out.println(root.value);
//        System.out.println("Left " + root.leftChild);
//        System.out.println("Right " + root.rightChild);
        if (isLeaf(root)) return root.value;

        var left = minimum(root.leftChild);
        var right = minimum(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    public boolean equals(Tree other) {
        if (other == null) return false;
        return equals(root, other.root);

    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null) {
            return first.value == second.value && equals(first.leftChild, second.leftChild) && equals(first.rightChild, second.rightChild);
        }
        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null) return true;
        if (root.value < min || root.value > max)
            return false;
        return isBinarySearchTree(root.leftChild, min, root.value - 1) && isBinarySearchTree(root.rightChild, root.value + 1, max);

    }

    public ArrayList<Integer> getNodesAtDistance(int distance) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list) {
        if (root == null) return;
        if (distance == 0) {
            list.add(root.value);
            return;
        }
        getNodesAtDistance(root.leftChild, distance - 1, list);
        getNodesAtDistance(root.rightChild, distance - 1, list);
    }

    public void traverseLevelOrder() {
        for (var i = 0; i <= height(); i++) {
            for (var val : getNodesAtDistance(i))
                System.out.print(val + ",");
        }
    }

    public List<Integer> getAncestors(int value) {
        var list = new ArrayList<Integer>();
        getAncestors(root, value, list);
        return list;
    }

    private boolean getAncestors(Node root, int value, List<Integer> list) {
        // We should traverse the tree until we find the target value. If
        // find the target value, we return true without adding the current node
        // to the list; otherwise, if we ask for ancestors of 5, 5 will be also
        // added to the list.
        if (root == null)
            return false;
        if (root.value == value)
            return true;
        // If we find the target value in the left or right sub-trees, that means
        // the current node (root) is one of the ancestors. So we add it to the list.
        if (getAncestors(root.leftChild, value, list) ||
                getAncestors(root.rightChild, value, list)) {
            list.add(root.value);
            return true;
        }
        return false;
    }

    public int size() {
        return size(root);
    }//size of the tree

    private int size(Node root) {
        if (root == null)
            return 0;
        if (isLeaf(root))
            return 1;
        return 1 + size(root.leftChild) + size(root.rightChild);
    }//leaves in the tree

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node root) {
        if (root == null)
            return 0;
        if (isLeaf(root))
            return 1;
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    public int max() {//maximum value in the tree
        if (root == null)
            throw new IllegalStateException();
        return max(root);
    } //O(log n)

    private int max(Node root) {
        if (root.rightChild == null)
            return root.value;
        return max(root.rightChild);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }//check if the value is in the tree

    private boolean contains(Node root, int value) {
        if (root == null)
            return false;

        if (root.value == value)
            return true;
        return contains(root.leftChild, value) || contains(root.rightChild, value);
    }

    public boolean areSibling(int first, int second) {
        return areSibling(root, first, second);
    }//if siblings are not

    private boolean areSibling(Node root, int first, int second) {
        if (root == null)
            return false;

        var areSibling = false;
        if (root.leftChild != null && root.rightChild != null) {
            areSibling = (root.leftChild.value == first && root.rightChild.value == second) ||
                    (root.rightChild.value == first && root.leftChild.value == second);
        }

        return areSibling ||
                areSibling(root.leftChild, first, second) ||
                areSibling(root.rightChild, first, second);
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node root) {
        if (root == null)
            return true;
        var balanceFactor = height(root.leftChild) - height(root.rightChild);

        return Math.abs(balanceFactor) <= 1 &&
                isBalanced(root.leftChild) &&
                isBalanced(root.rightChild);
    }

    public boolean isPerfect() {
        return size() == (Math.pow(2, height() + 1) - 1);
    }
}