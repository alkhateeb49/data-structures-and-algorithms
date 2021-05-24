package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//    ---------------------------------------------------------


    //      findMaximumValue
    public int findMaximumValue(){
        if(this.root== null){
            throw new NullPointerException("Empty Tree");
        }
        return findMaximumValue(this.root, this.root.value);
    }


    public int findMaximumValue(Node node, int max){
        if(node== null){
            return max;
        }else if(node.value >= max){
            max = node.value;
        }
        int maxLeft = findMaximumValue(node.left, max);
        int maxRight = findMaximumValue(node.right, max);
        if(maxLeft> maxRight){
            max = maxLeft;
        }else{
            max= maxRight;
        }
        return max;
    }



    //    ---------------------------------------------------------


    public List<Integer> breadthFirst(Node tree) {
        List<Integer> newlist=new ArrayList<>();
        Queue<Node> traversalQueue = new LinkedList<>();
        if (tree== null) {
            throw new NullPointerException("Empty");
        }
        else {
            traversalQueue.add(tree);
            newlist.add(tree.value);
            while (!traversalQueue.isEmpty()) {
                Node currentNode = traversalQueue.poll();
                System.out.println(currentNode);
                if (currentNode.left != null) {
                    traversalQueue.add(currentNode.left);
                    newlist.add(currentNode.left.value);
                }
                if (currentNode.right != null) {
                    traversalQueue.add(currentNode.right);
                    newlist.add(currentNode.right.value);
                }
            }
        }
        return newlist;
    }
    //    ---------------------------------------------------------

    public int OddSum(){
        return OddSum(this.root);
    }
    public int OddSum(Node root){
        int sum=0;
        if (root == null) {
            return sum;
        }
        if (root.value%2!=0) {
            sum+=root.value;
        }
        sum+=OddSum(root.right);
        sum+=OddSum(root.left);
        return sum;
    }

    //    TreeIntersection
    public ArrayList<Integer> treeIntersection(BinaryTree first, BinaryTree second){
        if(first.isEmpty() ||second.isEmpty()){
            return new ArrayList<>();
        }
        ArrayList<Integer> treeInput1 = first.preOrder();
        ArrayList<Integer> valueStore = new ArrayList<>();
        for(Integer number : treeInput1){
            if (second.contains(number)) {
                valueStore.add(number);
            }
        }
        return valueStore;
    }


}
