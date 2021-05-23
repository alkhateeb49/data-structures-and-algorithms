package reapeatedWord;

import org.junit.Test;
import quickSort.QuickSort;

import static org.junit.Assert.assertEquals;
import static repeatedWord.reapeatedWord.reapeatedWord;

public class reapeatedWordTest {

    @Test
    public void Test1() {
        String myStr = "Once upon a time, there was a brave princess who...";
        assertEquals("Should return a.","a" ,reapeatedWord(myStr));
    }

    @Test
    public void Test2() {
        String myStr = "";
        assertEquals("Should return Empty String.","Empty String" ,reapeatedWord(myStr));
    }

    @Test
    public void Test3() {
        String myStr = "Mohamad Mohamad Mohamad Mohamad Alkhateeb Alkhateeb Alkhateeb Alkhateeb";
        assertEquals("Should return mohamad.","mohamad" ,reapeatedWord(myStr));
    }
}
