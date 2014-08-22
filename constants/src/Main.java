public class Main {

    public static void main(String[] args){

        Human firstHuman = new Human();
        firstHuman.setName("Alex");
        firstHuman.setAge(21);

        Human secondHuman = new Human();
        secondHuman.setName("Ivan");
        secondHuman.setAge(4);

        firstHuman.showHuman();
        secondHuman.showHuman();
    }

}
