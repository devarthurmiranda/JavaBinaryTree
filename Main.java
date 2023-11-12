/**
 * Main
 */
import Tree.Node;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        Node node = new Node(n);

        for(int i = 0; i < 20; i++) {
            n = rand.nextInt(101);
            node.insert(n);
        }

        node.printPreOrder();
        System.out.println("");
        node.printInOrder();
        System.out.println(" ");
        node.printPostOrder();
        System.out.println(" ");
        node.printInLevel();
        
    }
}