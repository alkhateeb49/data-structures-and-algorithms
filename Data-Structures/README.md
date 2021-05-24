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
---
---

# Insertions
<!-- Short summary or background information -->
In-place comparison-based sorting algorithm that sorts a list one item at a time. It is less efficient on large lists than other sorting algorithms such as quick sort, heap sort, and merge sort but more efficient than bubble sort and selection sort.

## Challenge Description
<!-- Description of the challenge -->
Insertion sort iterates through the list. If it is the first element, it's already sorted and returns 1. On to the next element, it compares that element with all the elements in the sorted sub-list and swaps that value each time an item in the sub-list is greater than that element's value. This repeats until the entire list is sorted.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
InsertionSort(int[] arr) : Method for the Linked List class which takes a number.

## Solution
<!-- Embedded whiteboard image -->
 ![images](../assets/ll-insertions.png)

---

# kth from end
<!-- Short summary or background information -->
A LinkedList class and Node class. The LinkedList keeps track of what node is its head value, and each node contains its own value and a pointer to the node after it in the list.

## Challenge Description
<!-- Description of the challenge -->
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node. Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created. This object should be aware of a default empty value assigned to head when the linked list is instantiated. Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance. Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list. Define a method called print which takes in no arguments and outputs all of the current Node values in the Linked List.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
insert method Node O(n).
includes O(n).
toString O(n).

## Solution
<!-- Embedded whiteboard image -->
 ![images](../assets/ll-kth-from-end.png)

---


# Zip
<!-- Short summary or background information -->
A LinkedList class and Node class. The LinkedList keeps track of what node is its head value, and each node contains its own value and a pointer to the node after it in the list.

## Challenge Description
<!-- Description of the challenge -->
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node. Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created. This object should be aware of a default empty value assigned to head when the linked list is instantiated. Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance. Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list. Define a method called print which takes in no arguments and outputs all of the current Node values in the Linked List.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
insert method Node O(1).
includes O(n).
toString O(n).

## Solution
<!-- Embedded whiteboard image -->
 ![images](../assets/zipLists.png)

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
---
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

# Challenge Summary
<!-- Short summary or background information -->
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach. Implement the following methods: enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object. dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Challenge Description
<!-- Description of the challenge -->
My approach was to use to create a superclass of animals that the dog and cat classes would extend to. Then create an animalshelter class that would hold all of the animals in two queues, one for dogs and one for cats. The enqueue method would add new animals to whichever queue they abide by. The dequeue method would go through starting from the front to check if the preferred animal matches and dequeue that animal. My method for adding a node to the queue(enqueue) has a Big O time/space complexity of O(1), however my dequeue method has a time of O(n) and space of O(1).    

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* enqueue()

* dequeue()

* [FIFO Animal Shelter](/utilities)


## Solution
<!-- Embedded whiteboard image -->
 ![images](../assets/Animal.png)

---

# Challenge Summary
<!-- Short summary or background information -->
function should take a string and should return a boolean representing whether or not the brackets in the string are balanced.

## Challenge Description
<!-- Description of the challenge -->
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Used a stack to hold opening brackets and popped them off the stack when the corresponding closing bracket was found. If the closing brakcet did not match the top node in the stack, then the method would return false. If the stack is not empty in the end after iterating through the entire string input, it would also return false. This operates with a time and space complexity of O(n).

## Solution
<!-- Embedded whiteboard image -->
 ![images](../assets/multibracket.png)

---
---
---


# Trees
<!-- Short summary or background information -->
 a tree is a widely used abstract data type that simulates a hierarchical tree structure, with a root value and subtrees of children with a parent node, represented as a set of linked nodes.

## Challenge
<!-- Description of the challenge -->
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
* Create a BinaryTree class
    * Define a method for each of the depth first traversals called ```preOrder```, ```inOrder```, and ```postOrder``` which returns an array of the values, ordered appropriately.
* At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

* Create a BinarySearchTree class
    * Define a method named ```add``` that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    * Define a method named ```contains``` that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I used a recursive approach to my methods to accomplish the feature tasks.
* Time complexity: O(n)
* Space comnplexity: O(n)

## API
<!-- Description of each method publicly available in each of your trees -->
* BinarySearchTree.class
    * BinarySearchTree() // Constructors.
    * add() // Add a node to the tree at the correct location.
    * contains() // Check to see if a given value exists in the tree.
*  BinaryTree.class
    * BinaryTree() // Constructors.
    * preOrder() // Return an array of the values in pre-order.
    * inOrder() // Return an array of the values in in-order.
    * postOrder() // Return an array of the values in post-order.
    * isEmpty() // Checks to see if the tree is empty.
    * getRoot() // Returns the value at the root node.

---
---
---

# Code Challenge: Class 16
## find-maximum-value
## Challenge
- Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

## Approach and Efficiency
- Set the current max to -1, if the tree is empty, return -1. If not empty, max is equal to the root value. Using recursion, I am resetting the max value when traversing through the left and right nodes and then returning the max value. Time and space complexity of O(n).

## Solution
-  ![images](../assets/findmax.png)

---

# Code Challenge: Class 17
## find-maximum-value
## Challenge
- Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach; print every visited node’s value.

## Approach and Efficiency
* I combined a helper queue with an iterative approach to traverse every node in the tree and produce a System.out at a given node so long as it isn't null.
* Time: O(n)
* Space: O(n)

## Solution
-  ![images](../assets/breadthFirst.png)

---

# Code Challenge: Class 18
## fizzbuzz-tree
## Challenge
* Write a function called FizzBuzzTree which takes a tree as an argument.
* Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
* If the value is divisible by 3, replace the value with “Fizz”
* If the value is divisible by 5, replace the value with “Buzz”
* If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
* Return the tree with its new values.

## Approach and Efficiency
Approach is to write out the regular fizzbuzz conditionals and provide a starting node as root. Then worked through the tree using recursion to change the values. This has a time complexity of O(n) and space of O(n).

## Solution
-  ![images](../assets/fizzbuzz.png)

---

# Insertion Sort
## Challenge
* Complete a working, tested implementation of Insertion Sort, based on the pseudo code provided
* Create a blog post on understanding the Insertion Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way. E.g. a short skit, live mini-lecture, interpretive dance.

## Approach and Efficiency
* I utilized the imperative method prescribed in the pseudo code and achieved the following efficiencies.
    * Time Complexity: O(n^2)
    * Space Complexity: O(1)

## Solution
-  ![images](../assets/insertion.png)

---
# Merge Sort
## Challenge
* Complete a working, tested implementation of Merge Sort, based on the pseudo code provided
* Create a blog post on understanding the Merge Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way. E.g. a short skit, live mini-lecture, interpretive dance.


## Approach and Efficiency
* I utilized the recursive method prescribed in the pseudo code and achieved the following efficiencies:
    * Time Complexity: O(n log n)

## Solution
-  ![images](../assets/merge.png)

---

# Quick Sort
## Challenge
* Complete a working, tested implementation of Quick Sort, based on the pseudo code provided
* Create a blog post on understanding the Quick Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way. E.g. a short skit, live mini-lecture, interpretive dance.


## Approach and Efficiency
* I utilized the recursive method prescribed in the pseudo code and achieved the following efficiencies:
    * Time Complexity: O(n^2)

---
---
---


# Hash Tables
Implement a hashtable.

## Challenge
Implement a Hashtable with the following methods:

1. `add`: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
2. `get`: takes in the key and returns the value from the table.
3. `contains`: takes in the key and returns a boolean, indicating if the key exists in the table already.
4. `hash`: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
I implemented what I believe to be a standard hash table template.
* Big O : O(n)

## API
* -- Hashtable.java
* ---- Hashtable()
* ---- setTableSize()
* ---- add()
* ---- get()
* ---- contains()
* ---- hash()
* ---- toString()


--- 
# Repeated Word
## Challenge
Find the first repeated word in a book.

## Challenge Description
* Write a function that accepts a lengthy string parameter.
* Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.
## Approach & Efficiency
* Time Complexity: O(n)
* Space Complexity: O(n)

## Solution
*  ![images](../assets/repeatedword.png)

---

# Tree Intersection
## Challenge
Write a function called tree_intersection

## Challenge Description
Write a function called tree_intersection that takes two binary tree parameters.
Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

## Approach & Efficiency
* Time Complexity: O(n^2)

## Solution
*  ![images](../assets/treeintersection.png)

---

