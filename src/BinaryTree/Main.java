package BinaryTree;
//binary trees
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(21);
        tree.insert(20);
        tree.insert(13);
        tree.insert(36);
        tree.insert(55);
        tree.insert(38);
        tree.insert(28);
        tree.insert(62);
        tree.insert(73);
        tree.insert(70);
        tree.insert(63);
        tree.insert(61);
        tree.insert(95);
        tree.insert(92);

        //                    3
        //             1              6
        //                       5           11
        //                 4             9
        //            3
        System.out.println("Size of the tree : " + tree.size());
        System.out.print("Pre-Order  : ");
        tree.traversePreOrder();
        System.out.print("\nIn-Order   : ");
        tree.traverseInOrder();
        System.out.print("\nPost-Order : ");
        tree.traversePostOrder();
        System.out.print("\nLvl-Order  : ");
        tree.traverseLevelOrder();
//        System.out.print("\nItems in Tree2 Level Order : ");
//        tree2.traverseLevelOrder();
        System.out.println("\nCheck if the trees are equal : " + tree.equals(null));
        System.out.println("Max height of the tree : " + tree.height());
        System.out.println("Maximum value in the tree : " + tree.max());
        if (!tree.isBinarySearchTree())
            System.out.println("Minimum value in the tree : " + tree.min());  //for binary tree
        else
            System.out.println("Minimum value in the tree : " + tree.minimum());//throws NullPointerException //for binary search tree
        System.out.println("Balanced? : " + tree.isBalanced());
        System.out.println("Perfect? : " + tree.isPerfect());
        System.out.println("Binary SearchTree? : " + tree.isBinarySearchTree());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance to print Items on that distance : ");
        var list = tree.getNodesAtDistance(sc.nextInt());//distance here as parameter
        System.out.print("Items : ");
        for (var l : list) {
            System.out.print(l + ",");
        }
        System.out.print("\nEnter Value to print it's Ancestors : ");
        int lv = sc.nextInt();
        if (tree.contains(lv)) {
            var list2 = tree.getAncestors(lv);//distance here as parameter
            System.out.print("Ancestors : ");
            for (var l : list2) {
                System.out.print(l + ",");
            }
        } else System.out.println("Value " + lv + " not available in the tree.");
        System.out.print("\nEnter Values to print if they are Siblings : ");
        System.out.println(tree.areSibling(sc.nextInt(), sc.nextInt()));
    }
}
