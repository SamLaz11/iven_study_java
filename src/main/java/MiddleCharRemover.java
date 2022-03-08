public class MiddleCharRemover {
    public String[] remove(String[] input) {
        final WordMiddleElementFinder finder = new WordMiddleElementFinder();
        for (int i = 0, inputLength = input.length; i < inputLength; i++) {
            final String item = input[i];
            final int index = finder.find(item);
            if (index != -1) {
                input[i] = item.substring(0, index) + item.substring(index + 1);
            }
        }
        return input;
    }
}