package stringHashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class stringHashtableTest {

    LeftJoin leftJoin = new LeftJoin();
    Hashtable<String, String> hashtable1 = new Hashtable<>(1024);
    Hashtable<String, String> hashtable2 = new Hashtable<>(1024);
    Hashtable<String, String> hashtable3;

    @Before
    public void initializeTestData() {
        hashtable1.add("fond", "enamored");
        hashtable1.add("wrath", "anger");
        hashtable1.add("diligent", "employed");
        hashtable1.add("outfit", "garb");
        hashtable1.add("guide", "usher");

        hashtable2.add("fond", "averse");
        hashtable2.add("wrath", "delight");
        hashtable2.add("diligent", "idle");
        hashtable2.add("flow", "jam");
        hashtable2.add("guide", "follow");
    }

    @Test
    public void testLeftJoin() {
        String[][] outputArray = leftJoin.leftJoin(hashtable1, hashtable2);
        StringBuilder Ihatethistest = new StringBuilder();

        for (String[] array : outputArray) {
            Ihatethistest.append(Arrays.toString(array));
        }
        assertEquals("Should combine the two hash tables. ", "[fond, enamored, averse]" + "[wrath, anger, delight]" + "[outfit, garb, null]" + "[diligent, employed, idle]" + "[guide, usher, follow]", Ihatethistest.toString());
    }

    @Test
    public void testLeftJoin_EmptyFirstInputs() {
        assertNull("Should return an empty array. ", leftJoin.leftJoin(hashtable3, hashtable2));
    }

    @Test
    public void testLeftJoin_EmptyInputs() {
        assertNull("Should return an empty array. ", leftJoin.leftJoin(hashtable3, hashtable3));
    }
}
