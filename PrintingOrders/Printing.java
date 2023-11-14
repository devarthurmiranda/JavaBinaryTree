package PrintingOrders;
import Tree.Node;
import java.util.Random;

public class Printing {

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
        System.out.println(" ");
        node.remove(10);
        node.remove(20);
        node.remove(30);
        node.remove(40);
        node.remove(50);
        node.printPreOrder();
        System.out.println("");
        node.printInOrder();
        System.out.println(" ");
        node.printPostOrder();
        System.out.println(" ");
        node.printInLevel();
        System.out.println(" ");
    }
}