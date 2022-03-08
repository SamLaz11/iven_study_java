import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Удалить в каждом слове букву стоящею по середине, если нет середины-то ниче не делать.*/
        final SentenceToWordSplitter splitter = new SentenceToWordSplitter();
        final String[] split = splitter.split("Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
        final MiddleCharRemover middleCharRemover = new MiddleCharRemover();
        final String[] result = middleCharRemover.remove(split);

        System.out.println(Arrays.toString(result));
    }
}
