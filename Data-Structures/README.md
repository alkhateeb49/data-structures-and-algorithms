# Data Structures and Algorithms

# Singly Linked List
<!-- Short summary or background information -->
a linked list is a linear collection of data elements whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence. In its most basic form, each node contains: data, and a reference (in other words, a link) to the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position in the sequence during iteration. More complex variants add additional links, allowing more efficient insertion or removal of nodes at arbitrary positions.

## Challenge
<!-- Description of the challenge -->
Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- - insert => which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance. /BigO = 1  
- - incloudes =>which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.  /BigO = n
- - toString => which takes in no arguments and returns a string representing all the values in the Linked List, formatted as: /Big O = n

## API
<!-- Description of each method publicly available to your Linked List -->
 ![images](../assets/Linkedlist.png)

---


# Stacks and Queues
<!-- Short summary or background information -->
A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous.
Stacks follow these concepts:
FILO
First In Last Out
This means that the first item added in the stack will be the last item popped out of the stack.
LIFO
Last In First Out
This means that the last item added to the stack will be the first item popped out of the stack.
Stack Visualization

Common terminology for a queue is
Enqueue - Nodes or items that are added to the queue.
Dequeue - Nodes or items that are removed from the queue. If called when the queue is empty an exception will be raised.
Front - This is the front/first Node of the queue.
Rear - This is the rear/last Node of the queue.
Peek - When you peek you will view the value of the front Node in the queue. If called when the queue is empty an exception will be raised.
IsEmpty - returns true when queue is empty otherwise returns false.
Queues follow these concepts:
FIFO
First In First Out
This means that the first item in the queue will be the first item out of the queue.
LILO
Last In Last Out
This means that the last item in the queue will be the last item out of the queue.
## Challenge
<!-- Description of the challenge -->
Create a Stack and Queue and writhe (enqueue,dequeue,push,pop,peek,isEmpty) functions.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The desired time/space complexity goals of O(1) and O(n) respectively.
Through online documentation on writing stacks and queues in Java from scratch. I didn't want to rely on an underlying data structure and instead made the class itself into a data structure.

## API
<!-- Description of each method publicly available to your Stack and Queue-->
- - push -> which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
- - pop -> that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
- - enqueue -> which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
- - dequeue -> hat does not take any argument, removes the node from the front of the queue, and returns the node’s value.
- - Stack peek -> that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
- - Queue peek -> that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
- - isEmpty ->that takes no argument, and returns a boolean indicating whether or not the stack or queue is empty

---


# Challenge Summary
<!-- Short summary or background information -->
Implement a Queue using two Stacks.

## Challenge Description
<!-- Description of the challenge -->
Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.
The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For the enqueue() I pushed onto the back stack internal data structure every time it is called. This achieves an O(1) time and space complexity for the method.
For the dequeue() I treateds the two internal stacks akin to balancing cups, the back stack empties into the front stack every time and then pops the top of that stack. The front queue then immediately returns all of the elements into the back stack. This achieves an O(n) time complexity and an O(1) space complexity for the method.

## Solution
<!-- Embedded whiteboard image -->
 ![images](../assets/PseudoQueue.png)

---