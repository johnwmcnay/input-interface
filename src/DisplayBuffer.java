import java.util.Arrays;

public class DisplayBuffer {

    private static TextToDisplay[] buffer = {};

    public TextToDisplay[] getBuffer() {
        return buffer;
    }

    public static void queue(TextToDisplay obj) {
        push(obj);
    }

    public static void push(TextToDisplay obj) {
        buffer = Arrays.copyOf(buffer, buffer.length + 1);
        buffer[buffer.length - 1] = obj;
    }

    public static void queue(TextToDisplay[] objects) {
        for (TextToDisplay obj: objects) {
            push(obj);
        }
    }

    public static void printAll() {
        for (TextToDisplay obj: buffer) {
            obj.print();
        }
    }

    public static void printAll(TextToDisplay[] objects) {
        queue(objects);
        printAll();
    }

}
