package Stringtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<Type extends Comparable>{
    Node root;

    public BinaryTree(){
        this.root=null;
    }

    public BinaryTree(Type value){
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
    public ArrayList<Type> preOrder(){
        ArrayList<Type> results = new ArrayList<>();
        return preOrder(this.root,results);
    }
    public ArrayList<Type> preOrder(Node root, ArrayList<Type> index){
        if (root==null){return index;}
        index.add((Type)root.value);
        index=preOrder(root.left,index);
        index=preOrder(root.right,index);
        return index;
    }

//      inOrder
    public ArrayList<Type> inOrder(){
        ArrayList<Type> results = new ArrayList<>();
        return inOrder(this.root,results);
    }
    public ArrayList<Type> inOrder(Node root, ArrayList<Type> index){
        if (root==null){return index;}
        index=inOrder(root.left,index);
        index.add((Type)root.value);
        index=inOrder(root.right,index);
        return index;
    }

//      postOrder
    public ArrayList<Type> postOrder(){
        ArrayList<Type> results = new ArrayList<>();
        return postOrder(this.root,results);
    }
    public ArrayList<Type> postOrder(Node root, ArrayList<Type> index){
        if (root==null){return index;}
        index=postOrder(root.left,index);
        index=postOrder(root.right,index);
        index.add((Type)root.value);
        return index;
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
            if (dataValue.compareTo(node.value)>0){
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

//    ---------------------------------------------------------

//
//    //      findMaximumValue
//    public Type findMaximumValue(){
//        if(this.root== null){
//            throw new NullPointerException("Empty Tree");
//        }
//        return findMaximumValue(this.root, this.root.value);
//    }
//
//
//    public Type findMaximumValue(Node node, Type max){
//        if(node== null){
//            return max;
//        }else if(node.value >= max){
//            max = node.value;
//        }
//        Type maxLeft = findMaximumValue(node.left, max);
//        Type maxRight = findMaximumValue(node.right, max);
//        if(maxLeft> maxRight){
//            max = maxLeft;
//        }else{
//            max= maxRight;
//        }
//        return max;
//    }
//
//
//
//    //    ---------------------------------------------------------
//
//
//    public List<Type> breadthFirst(Node tree) {
//        List<Type> newlist=new ArrayList<>();
//        Queue<Node> traversalQueue = new LinkedList<>();
//        if (tree== null) {
//            throw new NullPointerException("Empty");
//        }
//        else {
//            traversalQueue.add(tree);
//            newlist.add(tree.value);
//            while (!traversalQueue.isEmpty()) {
//                Node currentNode = traversalQueue.poll();
//                System.out.println(currentNode);
//                if (currentNode.left != null) {
//                    traversalQueue.add(currentNode.left);
//                    newlist.add(currentNode.left.value);
//                }
//                if (currentNode.right != null) {
//                    traversalQueue.add(currentNode.right);
//                    newlist.add(currentNode.right.value);
//                }
//            }
//        }
//        return newlist;
//    }



}
