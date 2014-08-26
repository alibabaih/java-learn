package ui.message;

public class SernameNumberListener implements IOnStringInput {
    @Override
    public void onStringInput(String input) {
        System.out.println("Your surname is " + input);
    }
}
