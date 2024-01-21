package dsa_8_4_bst_traverse;

public class Bst_Traverse {
	class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node root = null;

    public void insert(int key) {
        Node newNode = new Node(key);
        Node currentNode = root;
        if (currentNode == null) {
            root = newNode;
            return;
        }
        while (true) {
            if (key < currentNode.data) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public void inOrder() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node node) {
        if (node != null) {
            inOrderHelper(node.left);
            System.out.println(node.data);
            inOrderHelper(node.right);
        }
    }
    public void preOrder() {
    	preOrderHelper(root);
    }

    private void preOrderHelper(Node node) {
        if (node != null) {
        	System.out.println(node.data);
        	preOrderHelper(node.left);
        	preOrderHelper(node.right);
        }
    }
    public void postOrder() {
    	postOrderHelper(root);
    }

    private void postOrderHelper(Node node) {
        if (node != null) {
        	postOrderHelper(node.left);
            postOrderHelper(node.right);
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
    	 Bst_Traverse  tree = new  Bst_Traverse ();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);

        // Display in-order traversal
        tree.inOrder();
        tree.postOrder();
        tree.preOrder();
    }

	
}
