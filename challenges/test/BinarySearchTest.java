public class BinarySearchTest {

    @Test
    public void Test1() {
        assertEquals("Should Return -1 ",-1, BinarySearch.BinarySearch(new int[] {},0));
    }

    @Test
    public void Test2() {
        assertEquals("Should Return Correct Index",2, BinarySearch.BinarySearch(new int[] {4,8,15,16,23,42},15));
    }

    @Test
    public void Test3() {
        assertEquals("Should Return -1 ",-1, BinarySearch.BinarySearch(new int[] {11,22,33,44,55,66,77},90));
    }

}