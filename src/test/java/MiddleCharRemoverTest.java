import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleCharRemoverTest {

    @Test
    public void remove() {
        final String[] input = new String[]{"Various", "versions", "have", "evolved", "over", "the", "years", "sometimes", "by", "accident", "sometimes", "on", "purpose", "injected", "humour", "and", "the", "like"};
        final MiddleCharRemover middleCharRemover = new MiddleCharRemover();
        final String[] actual = middleCharRemover.remove(input);
        final String[] expected = new String[]{"Varous", "versions", "have", "evoved", "over", "te", "yers", "someimes", "by", "accident", "someimes", "on", "purose", "injected", "humour", "ad", "te", "like"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyArray() {
        final String[] input = new String[]{""};
        final MiddleCharRemover middleCharRemover = new MiddleCharRemover();
        final String[] actual = middleCharRemover.remove(input);
        final String[] expected = new String[]{""};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneWord() {
        final String[] input = new String[]{"Various"};
        final MiddleCharRemover middleCharRemover = new MiddleCharRemover();
        final String[] actual = middleCharRemover.remove(input);
        final String[] expected = new String[]{"Varous"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void WordNull() {
        final String[] input = new String[]{"Various", "versions", null, "have"};
        final MiddleCharRemover middleCharRemover = new MiddleCharRemover();
        final String[] actual = middleCharRemover.remove(input);
        final String[] expected = new String[]{"Varous", "versions", null, "have"};
        assertArrayEquals(expected, actual);
    }
}