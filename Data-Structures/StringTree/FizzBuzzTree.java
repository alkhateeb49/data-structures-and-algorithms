package Stringtree;

public class FizzBuzzTree {
    public BinaryTree fizzBuzzTree(BinaryTree tree){
        if(tree == null){
            throw new NullPointerException("Empty Tree");
        }
        fizzBuzzTree(tree.root);
        return tree;
    }
    public void fizzBuzzTree(Node tree){
        if(tree == null){
            return;
        }
        if((int)tree.value %3 ==0 && (int)tree.value%5==0){
            tree.value = "FizzBuzz";
        }else if((int)tree.value %3 ==0 ){
            tree.value = "Fizz";
        }else if((int)tree.value %5 ==0 ){
            tree.value = "Buzz";
        }else{
            tree.value = tree.value.toString();
        }
        fizzBuzzTree(tree.right);
        fizzBuzzTree(tree.left);
    }


}

