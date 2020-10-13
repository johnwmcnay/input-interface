import java.rmi.activation.ActivationID;

public class Scene implements TextToDisplay {

    //TODO: What can happen in a scene?
    // talk to NPCs; go to another location/scene
    // more to add...

    public Menu menu;

    public Scene() {
        menu = new Menu("What do you want to do?",
                Actions.TALK,
                Actions.TRAVEL);
    }

    public void print() {

    }


}
