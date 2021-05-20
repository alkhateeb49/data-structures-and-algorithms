package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class hashtableTest {

    Hashtable hashTable = new Hashtable(1024);

    @Test
    public void addingKeyAndValue() {
        hashTable.add(1,"Saed");
        assertTrue("Must Return True ", hashTable.contains(1));
    }

    @Test
    public void retrievingValueBasedOnKey(){
        hashTable.add(2,"Ahmed");
        assertEquals("Must Contain String That Added : ", "Ahmed",hashTable.get(2));
    }

    @Test
    public void returnsNull() {
        assertEquals("return Null", null, hashTable.get(444444));

    }

    @Test
    public void handleCollision() {
        hashTable.add(3,"Khald");
        hashTable.add(3,"Jad");

        assertEquals("Must Contain New Value ", "HashKey : 431, Value : Jad\n", hashTable.toString());
    }

    @Test
    public void retrieveCollisionValue() {
        hashTable.add(3,"Khald");
        hashTable.add(3,"Jad");
        assertEquals("Must Contain New Value ", "Jad", hashTable.get(3));
    }

    @Test
    public void hashKey() {
        int key=5;
        assertFalse(hashTable.hash(key)==key);
    }


}
