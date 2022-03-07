public class ConsoleWriter {
    private final String message;


    public ConsoleWriter(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void write(){
        System.out.print(message);
    }
}
