public class Test {

    public static void main(String[] args) {
        Input input = new Input();
        Prompt prompt = new Prompt("Where do you want to go?");
        //menu is full of options
        Option option1 = new Option("Work");
        Option option2 = new Option("Restaurant");
        Option option3 = new Option("Nowhere");

        TextToDisplay[] test = {prompt, option1, option2, option3};

        DisplayBuffer.printAll(test);

//        Option.resetCount();
//        for (TextToDisplay obj: test) {
//            obj.print();
//        }
//        input.promptUser();
//
//        //encapsulate in a object/method--+
//        Option.resetCount();           // |
//        for (TextToDisplay obj: test) {// |
//            obj.print();               // |
//        }                              // |
//        input.promptUser();            //<+


    }
}
