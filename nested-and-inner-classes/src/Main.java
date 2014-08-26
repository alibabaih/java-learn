public class Main {

    private static int[] integers = {1, 2, 6};

    public static void main(String[] args){
        Human human = new Human("Vasiliy", 999);
        IAccaunt deposite = human.new HumanAccaunt();

        IAccaunt pension = human.new HumanAccaunt();

        System.out.println(human.getName() + "money: " + human.getMoney());

        deposite.changeSum(10);
        System.out.println(human.getName() + "money: " + human.getMoney());

        pension.changeSum(5);
        System.out.println(human.getName() + "money: " + human.getMoney());

        for(int element : integers){
            System.out.println(element);
        }

    }

}
