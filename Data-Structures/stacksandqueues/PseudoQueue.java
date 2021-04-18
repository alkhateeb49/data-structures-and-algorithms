
public class PseudoQueue {
    Stack frontStack;
    Stack backStack;

    public void enqueue(int value){
        this.backStack.push(value);
    }

    public int dequeue(){
        if(frontStack.isEmpty() && backStack.isEmpty()){
            throw new NullPointerException("Empty");
        }
        if(backStack.isEmpty()){
            while(!frontStack.isEmpty()){
                backStack.push(frontStack.pop());
            }
            return backStack.pop();
        }
        int pop=backStack.pop();
        return pop;
    }


}


}
