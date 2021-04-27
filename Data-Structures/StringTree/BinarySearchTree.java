package Stringtree;

import org.checkerframework.checker.units.qual.C;

public class BinarySearchTree<Type extends Comparable>{
    Node root;

    public BinarySearchTree(){
        this.root=null;
    }
    public BinarySearchTree(Type value){
        this.root=new Node(value);
    }

//      Add
    public void add(Type value) {
        if (this.root == null) {
            this.root = new Node(value);
        } else {
            this.root = add(root, value);
        }
    }
    private Node add(Node node, Type dataValue) {
        if (node == null) {
            node = new Node(dataValue);
        } else {
            if (dataValue.compareTo(node.value)>0) {
                node.left = add(node.left,dataValue);
            }
            else {
                node.right = add(node.right,dataValue);
            }
        }
        return node;
    }


//      contains
    public boolean contains ( Type value){
        return contains(this.root, value);
    }
    private boolean contains (Node currentNode, Type dataValue){
        if (currentNode == null) {
            return false;
        }
        if (dataValue == currentNode.value) {
            return true;
        }
        if (dataValue.compareTo(currentNode.value)<0) {
            return contains(currentNode.left, dataValue);
        } else {
            return contains(currentNode.right, dataValue);
        }
    }

}
