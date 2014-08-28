import exceptions.IllegalHumanNameException;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){
        //example of hindi code which throws exception
        String name = "Statia";
        int money = 14; //after some actions we get:
        name = null;    //and then
        try {
            Human i1 = new Human
                    .createInstance(name);
            System.out.println("Human name " + i1.getName() + "\nMoney " + money);
        } catch (IllegalHumanNameException e) {
            System.out.println("Error");
        }

        try {
            name = "Vasiliy";
            Human i1 = new Human.createInstance(name);
            System.out.println("Human name " + i1.getName() + "\nMoney " + money);
        } catch (IllegalHumanNameException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Этот блок полюбому выполниться.");
        }
    }
}
