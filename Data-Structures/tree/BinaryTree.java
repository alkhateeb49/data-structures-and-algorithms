package tree;

import java.util.ArrayList;

public class BinaryTree{
    Node root;

    public BinaryTree(){
        this.root=null;
    }

    public BinaryTree(int value){
        this.root=new Node(value);
    }

    public boolean isEmpty(){
        if (root==null){
            return true;
        }else{
            return false;
        }
    }

//      preOrder
    public ArrayList<Integer> preOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        return preOrder(this.root,results);
    }
    public ArrayList<Integer> preOrder(Node root,ArrayList<Integer> index){
        if (root==null){return index;}
        index.add(root.value);
        index=preOrder(root.left,index);
        index=preOrder(root.right,index);
        return index;
    }

//      inOrder
    public ArrayList<Integer> inOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        return inOrder(this.root,results);
    }
    public ArrayList<Integer> inOrder(Node root,ArrayList<Integer> index){
        if (root==null){return index;}
        index=inOrder(root.left,index);
        index.add(root.value);
        index=inOrder(root.right,index);
        return index;
    }

//      postOrder
    public ArrayList<Integer> postOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        return postOrder(this.root,results);
    }
    public ArrayList<Integer> postOrder(Node root,ArrayList<Integer> index){
        if (root==null){return index;}
        index=postOrder(root.left,index);
        index=postOrder(root.right,index);
        index.add(root.value);
        return index;
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
