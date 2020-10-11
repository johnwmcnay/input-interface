//TODO: start with the ability to prompt and answer

import java.util.Scanner;

public class Input implements TextToDisplay {

    private String prompt;
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);;
    }

    public void print() {
        System.out.print(">> ");
        this.scanner.nextLine();
    }
}
