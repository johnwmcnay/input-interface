import java.util.Arrays;

public class DisplayBuffer {

    private static TextToDisplay[] buffer = {};

    public TextToDisplay[] getBuffer() {
        return buffer;
    }

    public static void push(TextToDisplay obj) {
        buffer = Arrays.copyOf(buffer, buffer.length + 1);
        buffer[buffer.length - 1] = obj;
    }

    public static void queue(TextToDisplay ...objects) {
        for (TextToDisplay obj: objects) {
            push(obj);
        }
    }

    public static void printAll() {
        for (TextToDisplay obj: buffer) {
            obj.print();
        }
        resetBuffer();
    }

    public static void resetBuffer() {
        buffer = new TextToDisplay[0];
    }

    public static void printAll(TextToDisplay... objects) {
        queue(objects);
        printAll();
    }

    public static void printAndGetInput(TextToDisplay ...objects) {
        queue(objects);
        queue(InputBuffer.userInput());
        printAll();
    }

    public static TextToDisplay last() {
        return buffer[buffer.length - 1];
    }
}
