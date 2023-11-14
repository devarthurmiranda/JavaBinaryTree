package Tree;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public void remove(int value) {
        if (root != null) {
            if (root.data == value) {
                root = null;
            } else {
                root.remove(value);
            }
        }
    }

    public void printInOrder() {
        if (root != null) {
            root.printInOrder();
        }
    }

    public void printPreOrder() {
        if (root != null) {
            root.printPreOrder();
        }
    }

    public void printPostOrder() {
        if (root != null) {
            root.printPostOrder();
        }
    }

    public void printInLevel() {
        if (root != null) {
            root.printInLevel();
        }
    }

    public void balanceDSW() {
        // Step 1: Convert the BST to a vine
        flattenToVine(root);

        // Step 2: Perform the Day-Stout-Warren (DSW) algorithm to balance the tree
        int n = countNodes(root);
        int m = (int) (Math.pow(2, (int) (Math.log(n + 1) / Math.log(2)))) - 1; // Find the nearest power of 2 - 1

        // Perform the rotations
        compress(m);
    }

    // Helper method to convert BST to a vine
    private void flattenToVine(Node subtreeRoot) {
        Node pseudoRoot = new Node(0); // Dummy node to simplify code
        pseudoRoot.right = subtreeRoot;

        Node current = pseudoRoot;
        Node runner = pseudoRoot.right;

        while (runner != null) {
            if (runner.left == null) {
                current = runner;
                runner = runner.right;
            } else {
                Node temp = runner.left;
                runner.left = temp.right;
                temp.right = runner;
                runner = temp;
                current.right = temp;
            }
        }

        root = pseudoRoot.right; // Update the root after flattening to vine
    }

    // Helper method to count the number of nodes in the tree
    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // Helper method to perform the rotations for DSW
    private void compress(int count) {
        Node pseudoRoot = new Node(0); // Dummy node to simplify code
        pseudoRoot.right = root;

        Node current = pseudoRoot;

        for (int i = 0; i < count; i++) {
            Node temp = current.right;

            if (temp.left != null) {
                current.right = temp.left;
                temp.left = current.right.right;
                current.right.right = temp;
            } else {
                current = current.right;
            }
        }

        root = pseudoRoot.right; // Update the root after compression
    }
}
