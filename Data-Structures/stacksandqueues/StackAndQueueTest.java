public class StackAndQueueTest {
    
    @Test
    public void pushStack() {
        Stack test=new Stack();
        test.push(1);
        assertEquals("the output is",1 ,test.peek());
    }
    @Test
    public void pushMultiple(){
        Stack test=new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        assertEquals("the output is",3 ,test.peek());
    }
    @Test
    public void popOffStack(){
        Stack test=new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        test.pop();
        assertEquals("the output is",2 ,test.peek());
    }
    @Test
    public void popMultiple(){
        Stack test=new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        test.pop();
        test.pop();
        test.pop();
        assertEquals("the output is",true ,test.isEmpty());
    }

    @Test
    public void peekNextItemStack(){
        Stack test=new Stack();
        test.push(1);
        test.push(2);
        assertEquals("the output is",2 ,test.peek());
    }
    @Test
    public void instantiateEmptyStack(){
        Stack test=new Stack();
        assertEquals("the output is",true ,test.isEmpty());
    }


    @Test(expected = NullPointerException.class)
    public void peekEmptyStack(){
        Stack test=new Stack();
        int value=test.peek();
        assertEquals(new NullPointerException(), value);
    }


    @Test
    public void enqueueIntoQueue(){
        Queue test=new Queue();
        test.enqueue(1);
        assertEquals("the output is",1 ,test.peek());
    }

    @Test
    public void enqueueMultipleQueue(){
        Queue test=new Queue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        assertEquals("the output is",1 ,test.peek());
    }

    @Test
    public void dequeueOfQueue(){
        Queue test=new Queue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        assertEquals("the output is",1 ,test.dequeue());
    }

    @Test
    public void  peekIntoQueue(){
        Queue test=new Queue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.dequeue();
        assertEquals("the output is",2 ,test.peek());
    }

    @Test
    public void emptyQueue(){
        Queue test=new Queue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.dequeue();
        test.dequeue();
        test.dequeue();
        assertEquals("the output is",true ,test.isEmpty());
    }
    @Test
    public void instantiateEmptyQueue(){
        Queue test=new Queue();
        assertEquals("the output is",true ,test.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void peekEmptyQueue(){
        Stack test=new Stack();
        int value=test.peek();
        assertEquals(new NullPointerException(), value);
    }

}
