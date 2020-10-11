import java.util.Arrays;

public class InputBuffer {

    private static final String inputIndicator = ">> ";
    private static final Input input = new Input(inputIndicator);
    private static String[] buffer = {};

    public static void push(String str) {
        buffer = Arrays.copyOf(buffer, buffer.length + 1);
        buffer[buffer.length - 1] = str;
    }

    public static TextToDisplay userInput() {
        return input;
    }
}
