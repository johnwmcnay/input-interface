public class Test {

    public static void main(String[] args) {
        sceneTest();
    }

    public static void sceneTest() {
        Scene scene1 = new Scene();
        Scene scene2 = new Scene();

        String currentScene = "scene1";

        if (currentScene.equalsIgnoreCase("scene1")) {
            //run scene one
            //get text to display: description, menu/options
            System.out.println("scene1");
            DisplayBuffer.printAll(scene1.menu);


        } else {
            System.out.println("scene2");
        }

    }

    public static void menuTest() {
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
