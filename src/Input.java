import java.util.Scanner;

public class Input implements TextToDisplay {

    private static String prompt;
    private static final Scanner scanner = new Scanner(System.in);

    public Input(String str) {
        prompt = str;
    }

    public String getInput() {
        return scanner.nextLine();
    }

    @Override
    public void print() {
        System.out.print(prompt);
        InputBuffer.push(getInput());
    }
}
