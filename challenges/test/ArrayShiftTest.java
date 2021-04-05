public class ArrayShiftTest {

  @Test public void testArrayShift1() {
    int[] Arr = new int[]{2,4,6,8};
    int[] outArr = new int[]{2,4,5,6,8};
    assertArrayEquals("even length", outArr, ArrayShift.insertShiftArray(Arr, 5));
  }

  @Test public void testArrayShift2() {
    int[] Arr2 = new int[]{4,8,15,23,42};
    int[] outArr2 = new int[]{4,8,15,16,23,42};
    assertArrayEquals("odd length", outArr2, ArrayShift.insertShiftArray(Arr2, 16));
  }

  @Test public void testArrayShift3(){
    assertArrayEquals("empty array", new int[]{1}, ArrayShift.insertShiftArray(new int[]{}, 1));
  }
}