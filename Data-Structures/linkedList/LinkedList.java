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
}

