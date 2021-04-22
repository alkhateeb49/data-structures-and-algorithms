package tree;
import org.junit.Test;
import utilities.MultiBracketValidation;

import java.util.ArrayList;

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




}
