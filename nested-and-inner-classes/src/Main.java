import java.util.Iterator;

public class Main {

    private static int[] integers = {1, 2, 6};

    public static void main(String[] args){
        Human vasiliy = new Human("Vasiliy", 999);
        IAccaunt deposite = vasiliy.new HumanAccaunt();

        IAccaunt pension = vasiliy.new HumanAccaunt();

        System.out.println(vasiliy.getName() + " " + "money: " + vasiliy.getMoney());

        deposite.changeSum(10);
        System.out.println(vasiliy.getName() + " " + "money: " + vasiliy.getMoney());

        pension.changeSum(5);
        System.out.println(vasiliy.getName() + "money: " + vasiliy.getMoney());

        System.out.println("----------------------");

        //for each loop
        for(int element : integers){
            System.out.println(element);
        }

        System.out.println("----------------------");

        Building building = new Building();
        Human ivan = new Human("Ivan");
        Human slava = new Human("Slava");

        building.addPeoples(ivan);  //adding human in building
        building.addPeoples(slava); //adding human in building

        /*
        for (int i = 0; i < building.getHowMachPeoples(); i++){
            System.out.println("In building: "+ building.get(i));
        }
        */

        for (Human human : building){   //implements iterable for Human class
            System.out.println("In building: "+ human);
        }

        /*
        Iterator<Human> building.iterator = building.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        */

    }

}
