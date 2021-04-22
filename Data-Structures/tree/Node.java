package tree;

public class Node {

    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left= null;
        this.right= null;
    }
    Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.left = leftChild;
        this.right = rightChild;
    }

    public void setLeftChild(Node child) {
        this.left = child;
    }

    public void setRightChild(Node child) {
        this.right = child;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
