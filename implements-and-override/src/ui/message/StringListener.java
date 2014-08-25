package ui.message;
//импортируем интерфейс т.к. он лежит в другом пакете
//чтобы класс реализовывал интерфейс указываем ключевое слово implements
public class StringListener implements IOnStringInput {


    @Override
    public void onStringInput(String input) {
        System.out.println("User input: " + input);
    }
}
