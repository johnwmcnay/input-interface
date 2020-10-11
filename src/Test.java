public class Test {

    public static void main(String[] args) {

        Menu menu1 = new Menu("Where do you want to go?",
                "Work",
                "Restaurant",
                "Nowhere");

        Menu menu2 = new Menu("What do you want to do?",
                "Eat",
                "Drink",
                "Sit");

        TextToDisplay[] test1 = {menu1, InputBuffer.userInput()};
        DisplayBuffer.printAll(test1);

        TextToDisplay[] test2 = {menu2, InputBuffer.userInput()};
        DisplayBuffer.printAll(test2);

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
