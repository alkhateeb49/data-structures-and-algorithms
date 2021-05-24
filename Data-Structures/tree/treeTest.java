package tree;
import Stringtree.FizzBuzzTree;
import org.junit.Test;
import utilities.MultiBracketValidation;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class treeTest {
    @Test
        public void instantiateTreeTest() {
        BinaryTree tree=new BinaryTree();
        assertTrue("The tree is Empty",tree.isEmpty());
    }
    @Test
    public void instantiateTreeWithSingleTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        assertFalse("The tree is not Empty",tree.isEmpty());
    }

    @Test
    public void addLeftChildAndRightChild() {
        BinaryTree tree=new BinaryTree();
        tree.add(1);
        tree.add(2);
        ArrayList<Integer>test=new ArrayList<>();
        test.add(1);
        test.add(2);
        assertEquals("The tree is Equal",test,tree.preOrder());
    }

    @Test
    public void  treePreorderTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(1);tree.add(2);tree.add(3);tree.add(4);tree.add(5);tree.add(6);tree.add(7);tree.add(8);tree.add(9);
        ArrayList<Integer>test=new ArrayList<>();
        test.add(1);test.add(2);test.add(3);test.add(4);test.add(5);test.add(6);test.add(7);test.add(8);test.add(9);
        assertEquals("The tree is Equal",test,tree.preOrder());
    }

    @Test
    public void  treePostOrderTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(1);tree.add(2);tree.add(3);tree.add(4);tree.add(5);
        ArrayList<Integer>test=new ArrayList<>();
        test.add(5);test.add(4);test.add(3);test.add(2);test.add(1);
        assertEquals("The tree is Equal",test,tree.postOrder());
    }


    @Test
    public void  treeInOrderTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(1);tree.add(2);tree.add(3);tree.add(4);tree.add(5);tree.add(6);tree.add(7);tree.add(8);tree.add(9);
        ArrayList<Integer>test=new ArrayList<>();
        test.add(1);test.add(2);test.add(3);test.add(4);test.add(5);test.add(6);test.add(7);test.add(8);test.add(9);
        assertEquals("The tree is Equal",test,tree.inOrder());
    }
//---------------------------------------------------------------------------------------
    @Test
    public void  findMaxOnTreeTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(7);
        tree.add(1);
        tree.add(4);
        tree.add(322);
        tree.add(31);
        tree.add(5);
        assertEquals("The tree is Equal",322,tree.findMaximumValue());
    }

    @Test(expected = NullPointerException.class)
    public void FindMaxValueInEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(new NullPointerException(), tree.findMaximumValue());
    }

    @Test
    public void  findMaxOnOneValueTreeTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(7);
        assertEquals("The tree is Equal",7,tree.findMaximumValue());
    }

//---------------------------------------------------------------------------------------

    @Test
    public void  breadthFirstTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(7);
        tree.add(27);
        tree.add(4);
        tree.add(1);
        tree.add(8);
        List<Integer> test=new ArrayList<>();
        test.add(7);
        test.add(4);
        test.add(27);
        test.add(1);
        test.add(8);
        assertEquals("The tree is Equal",test,tree.breadthFirst(tree.root));
    }


    @Test(expected = NullPointerException.class)
    public void breadthFirstInEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(new NullPointerException(), tree.breadthFirst(tree.root));
    }

    @Test
    public void  breadthFirstOnOneValueTreeTest() {
        BinaryTree tree=new BinaryTree();
        tree.add(7);
        List<Integer> test=new ArrayList<>();
        test.add(7);
        assertEquals("The tree is Equal",test,tree.breadthFirst(tree.root));
    }

    //---------------------------------------------------------------------------------------
    @Test
    public void  fizzBuzzTreeTest() {
        Stringtree.BinaryTree tree=new Stringtree.BinaryTree();
        tree.add(2);
        tree.add(5);
        tree.add(2);
        tree.add(6);
        tree.add(5);
        tree.add(11);
        tree.add(9);
        tree.add(4);
        tree.add(15);
        FizzBuzzTree Test =new FizzBuzzTree();
        List<String> Actual=new ArrayList<>();
        Actual.add("2");
        Actual.add("Buzz");
        Actual.add("Fizz");
        Actual.add("11");
        Actual.add("FizzBuzz");
        Actual.add("Fizz");
        Actual.add("Buzz");
        Actual.add("4");
        Actual.add("2");
        assertEquals("The tree is Equal",Actual,Test.fizzBuzzTree(tree).preOrder());
    }

    @Test
    public void fizzBuzzTreeTestEmptyTree(){
        Stringtree.BinaryTree tree=new Stringtree.BinaryTree();
        FizzBuzzTree Test =new FizzBuzzTree();
        List<String> Actual=new ArrayList<>();
        assertEquals("The tree is Equal",Actual,Test.fizzBuzzTree(tree).preOrder());
    }

    @Test
    public void  fizzBuzzTreeTestOnOneValue(){
        Stringtree.BinaryTree tree=new Stringtree.BinaryTree();
        FizzBuzzTree Test =new FizzBuzzTree();
        tree.add(2);
        List<String> Actual=new ArrayList<>();
        Actual.add("2");
        assertEquals("The tree is Equal",Actual,Test.fizzBuzzTree(tree).preOrder());
    }


//      TreeIntersection

    @Test
    public void  treeIntersectionEmpty(){
        BinaryTree testTree1 = new BinaryTree();
        BinaryTree testTree2 = new BinaryTree();
        BinaryTree testTree3 = new BinaryTree();
        ArrayList<Integer> test = new ArrayList<>();

        assertEquals("Should Return Empty List",test,testTree3.treeIntersection(testTree1,testTree2));
    }

    @Test
    public void  treeIntersectionNoMatch(){
        BinaryTree testTree1 = new BinaryTree();
        testTree1.add(1);testTree1.add(2);
        BinaryTree testTree2 = new BinaryTree();
        testTree2.add(3);testTree2.add(4);

        BinaryTree testTree3 = new BinaryTree();
        ArrayList<Integer> test = new ArrayList<>();

        assertEquals("Should Return Empty List",test,testTree3.treeIntersection(testTree1,testTree2));
    }

    @Test
    public void  treeIntersectionRegular(){
        BinaryTree testTree1 = new BinaryTree();
        testTree1.add(1);testTree1.add(2);testTree1.add(3);testTree1.add(4);
        BinaryTree testTree2 = new BinaryTree();
        testTree2.add(6);testTree2.add(5);testTree2.add(3);testTree2.add(4);

        BinaryTree testTree3 = new BinaryTree();
        ArrayList<Integer> test = new ArrayList<>();
        test.add(3);test.add(4);

        assertEquals("Should Return Empty List",test,testTree3.treeIntersection(testTree1,testTree2));
    }

}
