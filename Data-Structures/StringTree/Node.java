package Stringtree;

public class Node<Type> {

    Type value;
    Node left;
    Node right;

    Node(Type value) {
        this.value = value;
        this.left= null;
        this.right= null;
    }
    Node(Type value, Node leftChild, Node rightChild) {
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

    public void setValue(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return this.value;
    }
}
