import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest {
    static ArrayIndexStorage ais;

    @BeforeAll
    public static void initData() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ais = new ArrayIndexStorage(a);
    }

    @Test
    public void testArraySize(){
        int expected = 10;
        int actual = ais.size;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testArrayEquals() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(expected, ais.arr);
    }

    @Test
    public void testItemValue() {
        Assertions.assertEquals(10, ais.reverse()[0]);
    }

    @Test
    public void testIsArray() {
        Assertions.assertTrue(((Object)ais.arr instanceof int[]));
    }

    @Test
    public void testArrSize() {
        Assertions.assertEquals(10, ais.size());
    }

    @Test
    public void testGetNegative() {
        IndexStorage indexStorage = new IndexStorage(5);
        Assertions.assertEquals(-1, indexStorage.get(1));
    }

    @Test
    public void testGetPositive() {
        IndexStorage indexStorage = new IndexStorage(5);
        Assertions.assertEquals(4, indexStorage.get(4));
    }
}
