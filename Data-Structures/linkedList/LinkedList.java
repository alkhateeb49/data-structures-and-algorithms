package com.example.linkedList;

public class LinkedList {
    Node head;

    public LinkedList(){
        head=null;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean includes(int data){
        Node current = head;
        if(current == null){
           return false;
        }
        while (current!=null){
            if (current.value==data){
                return true;
            }else {
                current = current.next;
            }
        }
        return false;
    }

    public String toString(){
        Node current = head;
        String msg ="";
        if(current == null){
            msg=("This linked list is Empty.");
        }
        while (current!= null){
            msg=msg+"{ "+current.value+" } ->";
            current =  current.next;
        }
        msg=msg+"null";
        return msg;
    }

    // ---------------------------------------------

    public void append(int dataValue){
        Node  newNode = new Node(dataValue);
        Node  currentNode = head;
        if (currentNode != null){
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return;
        }
    }

    public void insertBefore(int targetValue, int newValue){
        Node newNode = new Node(newValue);
        Node currentNode = head;
        Node previous = head;
        if (includes(targetValue)){
            if (head.data == targetValue){
                newNode.next = head;
                head = newNode;
                return;
            }
            while (currentNode != null){
                if (currentNode.data == targetValue){
                    newNode.next = currentNode;
                    previous.next = newNode;
                    return;
                }
                previous = currentNode;
                currentNode = currentNode.next;
            }
        }
    }

    public void insertAfter(int targetValue, int newValue){
        Node newNode = new Node(newValue);
        Node currentNode = head;
        if (includes(targetValue)){
            if (head == targetValue){
                head.next = newNode;
                return;
            }
            while (currentNode != null){
                if (currentNode.data == targetValue){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }





}

