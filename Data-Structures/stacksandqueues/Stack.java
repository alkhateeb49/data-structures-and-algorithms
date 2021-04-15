package New.link;

public class Stack {
    Node top;

    public Stack() {
        Node top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        int value = top.value;
        if (isEmpty()) {
            throw new NullPointerException("Stack empty");
        }
        top = top.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NullPointerException("Stack empty");
        }else{
            return top.value;
        }
    }






    public Boolean isEmpty() {
        if(top==null){
            return true;
        }else{
            return false;
        }

    }



}
