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
}