import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SentenceToWordSplitterTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();


    @Test
    public void split() {
        final SentenceToWordSplitter sentenceToWordSplitter = new SentenceToWordSplitter();
        final String[] actual = sentenceToWordSplitter.split("Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
        final String[] expected = new String[]{"Various", "versions", "have", "evolved", "over", "the", "years", "sometimes", "by", "accident", "sometimes", "on", "purpose", "injected", "humour", "and", "the", "like"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void splitNull() {
        final SentenceToWordSplitter sentenceToWordSplitter = new SentenceToWordSplitter();
        exceptionRule.expect(NullPointerException.class);
        exceptionRule.expectMessage("Sentence must not null lenght");
        sentenceToWordSplitter.split(null);
    }

    @Test
    public void splitLength0() {
        final SentenceToWordSplitter sentenceToWordSplitter = new SentenceToWordSplitter();
        exceptionRule.expect(NegativeArraySizeException.class);
        exceptionRule.expectMessage("Sentence length must be more then 0");
        sentenceToWordSplitter.split("");
    }
}