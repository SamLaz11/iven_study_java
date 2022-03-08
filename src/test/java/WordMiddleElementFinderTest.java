import org.junit.Test;

import static org.junit.Assert.*;

public class WordMiddleElementFinderTest {

    @Test
    public void find() {
        final String input = "cat";
        final WordMiddleElementFinder wordMiddleElementFinder = new WordMiddleElementFinder();
        int actual = wordMiddleElementFinder.find(input);
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void FindWordWithoutMiddleVeriable() {
        final String input = "catcat";
        final WordMiddleElementFinder wordMiddleElementFinder = new WordMiddleElementFinder();
        int actual = wordMiddleElementFinder.find(input);
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void FindEmptyString() {
        final String input = "";
        final WordMiddleElementFinder wordMiddleElementFinder = new WordMiddleElementFinder();
        int actual = wordMiddleElementFinder.find(input);
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void FindSpace() {
        final String input = " ";
        final WordMiddleElementFinder wordMiddleElementFinder = new WordMiddleElementFinder();
        int actual = wordMiddleElementFinder.find(input);
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void FindNullString() {
        final String input = null;
        final WordMiddleElementFinder wordMiddleElementFinder = new WordMiddleElementFinder();
        int actual = wordMiddleElementFinder.find(input);
        final int expected = -1;
        assertEquals(expected, actual);
    }
}