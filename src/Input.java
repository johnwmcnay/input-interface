//TODO: start with the ability to prompt and answer

import java.util.Scanner;

public class Input {

    private String prompt;
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);;
    }

    public String promptUser() {
        System.out.print(">> ");
        return this.scanner.nextLine();
    }
}
