package com.example.linkedList;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class listTest {

    @Test
    public void testInsert(){
        LinkedList newLink = new LinkedList();
        newLink.insert(5);
        newLink.insert(6);
        newLink.insert(9);
        String expicted = "{ 9 } ->{ 6 } ->{ 5 } ->NULL";
        assertEquals("the output is", expicted, newLink.toString());
    }
    @Test
    public void testIncludes(){
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(9);
        assertTrue("the output is", l.includes(5));
    }

// ----------------------------------------------------------


@Test
public void testAppend() {
    LinkedList test = new LinkedList();
    n.insert(2);
    n.append(14);
    n.append(1);
    String expicted1 = "{ 2 } ->{ 14 } ->{ 1 } ->NULL";
    assertEquals("the output is", expicted1, test.toString());
}

@Test
public void testAddBefore() {
    LinkedList test = new LinkedList();
    n.insert(14);
    n.insert(7);
    n.insert(4);
    n.insert(6);
    n.addBefore(14, 2);
    String expicted1 = "{ 6 } ->{ 4 } ->{ 7 } ->{ 2 } ->{ 14 } ->NULL";
    assertEquals("the output is", expicted1,test.toString());
}

@Test
public void testAddAfter() {
    LinkedList test = new LinkedList();
    n.insert(2);
    n.insert(5);
    n.insert(4);
    n.insert(10);
    n.addAfter(10, 3);
    String expicted1 = "{ 10 } ->{ 3 } ->{ 4 } ->{ 5 } ->{ 2 } ->NULL";
    assertEquals("the output is", expicted1, test.toString());
}


}