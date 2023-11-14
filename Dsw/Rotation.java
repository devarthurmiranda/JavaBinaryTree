package Dsw;
import Tree.Node;

public class Rotation {
    public static Node dswRotateTree(Node root) {
        Node newRoot = root;
        Node tail = root;
        Node rest = tail.right;
        while(rest != null) {
            if(rest.left == null) {
                tail = rest;
                rest = rest.right;
            } else {
                Node temp = rest.left;
                rest.left = temp.right;
                temp.right = rest;
                rest = temp;
                tail.right = temp;
            }
        }
        return newRoot;
    }


    public static void main(String[] args) {
        Node node = new Node(50);
        node.insert(40);
        node.insert(60);
        node.insert(35);
        node.insert(45);
        node.insert(65);
        node.insert(34);
        node.insert(63);
        node.insert(70);
        node.insert(33);
        node.insert(32);
        node.printInLevel();
        System.out.println(" ");
        node = dswRotateTree(node);
        node.printInLevel();
        System.out.println(" ");


    }
}
