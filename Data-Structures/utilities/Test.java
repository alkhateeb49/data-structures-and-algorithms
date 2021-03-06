/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package New.link;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {


    @Test
    public void AnimalShelterTest1(){
        AnimalShelter test=new AnimalShelter();
        Animal Cat = new Cat("ash");
        test.enqueue(Cat);
        assertEquals("the output is","ash" ,test.dequeue());
    }
    @Test
    public void AnimalShelterTest2(){
        AnimalShelter test=new AnimalShelter();
        Animal Dog = new Dog("ash");
        test.enqueue(Dog);
        assertEquals("the output is","ash" ,test.dequeue.peek());
    }
    @Test(expected = NullPointerException.class)
    public void AnimalShelterEmptyTest(){
        AnimalShelter test=new AnimalShelter();
        assertEquals(new NullPointerException(), test.dequeue());
    }

}