package tree;

public class BinarySearchTree{
    Node root;

    public BinarySearchTree(){
        this.root=null;
    }
    public BinarySearchTree(int value){
        this.root=new Node(value);
    }

//      Add
    public void add(int value) {
        if (this.root == null) {
            this.root = new Node(value);
        } else {
            this.root = add(root, value);
        }
    }
    private Node add(Node node,int dataValue) {
        if (node == null) {
            node = new Node(dataValue);
        } else {
            if (node.value > dataValue) {
                node.left = add(node.left,dataValue);
            }
            else {
                node.right = add(node.right,dataValue);
            }
        }
        return node;
    }


//      contains
    public boolean contains ( int value){
        return contains(this.root, value);
    }
    private boolean contains (Node currentNode,int dataValue){
        if (currentNode == null) {
            return false;
        }
        if (dataValue == currentNode.value) {
            return true;
        }
        if (dataValue < currentNode.value) {
            return contains(currentNode.left, dataValue);
        } else {
            return contains(currentNode.right, dataValue);
        }
    }

}
