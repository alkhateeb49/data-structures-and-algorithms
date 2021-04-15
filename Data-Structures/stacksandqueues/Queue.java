package New.link;

public class Queue {
    Node front;
    Node rear;
    public Queue() {
        Node front = null;
        Node rear = null;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else {
            rear.next=newNode;
            rear=rear.next;
        }
    }

    public int dequeue(){
        int value = front.value;
        if (isEmpty()) {
            throw new NullPointerException("Stack empty");
        }
        front=front.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NullPointerException("Stack empty");
        }else{
            return front.value;
        }
    }

    public Boolean isEmpty() {
        if(front==null){
            return true;
        }else{
            return false;
        }
    }

}
