import org.junit.Test;
import static org.junit.Assert.*;
// testing class
public class AsteroidsTest {

    @Test
    public void testExample() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMath1() {
        assertEquals(10, 5 + 5);
    }

    @Test
    public void testMath2() {
        assertTrue(100 > 50);
    }

    @Test
    public void testStrings() {
        assertEquals("hello", "he" + "llo");
    }

    @Test
    public void testBoolean() {
        boolean flag = true;
        assertTrue(flag);
    }

    @Test
    public void testArrayLength() {
        int[] arr = {1, 2, 3};
        assertEquals(3, arr.length);
    }

    @Test
    public void testArrayContent() {
        int[] arr = {4, 5, 6};
        assertEquals(5, arr[1]);
    }

    @Test
    public void testLoop() {
        int sum = 0;
        for(int i = 0; i < 5; i++) sum += i;
        assertEquals(10, sum); // 0+1+2+3+4 = 10
    }

    @Test
    public void testStringContains() {
        assertTrue("asteroid".contains("roid"));
    }

    @Test
    public void testNotNull() {
        Object obj = new Object();
        assertNotNull(obj);
    }

    @Test
    public void testFalse() {
        assertFalse(5 > 10);
    }

    @Test
    public void testUppercase() {
        assertEquals("NASA", "nasa".toUpperCase());
    }
}


// tests are complete
// testing Jenkins email notification
