public class WordMiddleElementFinder {
    public int find(String word) {
        int result = -1;
        if (word != null) {
            final int length = word.length();
            if ((length % 2) != 0 && length != 1) { //length != 1 for avoid wrong value on empty string
                result = (length - 1) / 2;
            }
        }
        return result;
    }
}