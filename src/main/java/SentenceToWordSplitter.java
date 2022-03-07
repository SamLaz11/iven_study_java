public class SentenceToWordSplitter {
    public String[] split(String sentence) throws NullPointerException{
        String[] result;
        if(sentence == null){
            throw new NullPointerException("Sentence must not null lenght");
        }
         if (sentence.length() == 0){
            throw new NegativeArraySizeException("Sentence length must be more then 0");
        }

        result = sentence.split("([^a-zA-Z']+)'*\\1*");

        return result;
    }
}
