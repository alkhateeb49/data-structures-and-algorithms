package tree;

import java.util.ArrayList;

public class TreeIntersection {

    public TreeIntersection(BinaryTree tree, BinaryTree tree2) {

    }

    public static ArrayList<Integer> treeIntersection(BinaryTree first, BinaryTree second){
        if(first.isEmpty() ||second.isEmpty()){
            return new ArrayList<>();
        }
        ArrayList<Integer> treeInput1 = first.preOrder();
        ArrayList<Integer> valueStore = new ArrayList<>();
        for(Integer number : treeInput1){
            if (second.contains(number)) {
                valueStore.add(number, 1);
            }
        }
        return valueStore;

    }


}
