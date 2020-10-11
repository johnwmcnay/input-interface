import java.util.Arrays;

public class Menu implements TextToDisplay {

    private TextToDisplay[] content = {};

    public Menu(String ...strings) {
        for (byte i = 0; i < strings.length; i++) {
            if (i == 0) {
                push(new Prompt(strings[i]));
            } else {
                push(new Option(strings[i]));
            }
        }
    }

    public void push(TextToDisplay obj) {
        content = Arrays.copyOf(content, content.length + 1);
        content[content.length - 1] = obj;
    }

    public void print() {
        for (TextToDisplay obj: content) {
            obj.print();
        }
        Option.resetCount();
    }
}
