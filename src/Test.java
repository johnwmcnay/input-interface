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

        DisplayBuffer.printAndGetInput(menu1);
        DisplayBuffer.printAndGetInput(menu2);
    }
}
