package Dsw;

import Tree.BinaryTree;

public class DSW {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        
        // Insert values into the tree (unbalanced)
        binaryTree.insert(50);
        binaryTree.insert(40);
        binaryTree.insert(60);
        binaryTree.insert(35);
        binaryTree.insert(45);
        binaryTree.insert(65);
        binaryTree.insert(34);
        binaryTree.insert(63);
        binaryTree.insert(70);
        binaryTree.insert(33);
        binaryTree.insert(32);
        
        // Display the tree before balancing
        System.out.println("Tree before balancing (in-level):");
        binaryTree.printInLevel();

        // Balancing the tree using DSW
        binaryTree.balanceDSW();

        // Display the tree after balancing
        System.out.println("\nTree after balancing (in-level):");
        binaryTree.printInLevel();
    }
}