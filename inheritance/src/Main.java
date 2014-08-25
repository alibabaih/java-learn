public class Main {

    public static void main(String[] args){
        Human human = new Human("Max");
        System.out.println(human.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Student student = new Student("Vasiliy");
        System.out.println(student.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        House house = new House();
        Human houseOwner = student; //переходный момент
        house.setHuman(houseOwner); //студента селим в хауз как хауз оунера
        //а можно без перехода
        //house.setHuman(student);
        System.out.println("Owner name: " + house.getOwnerName());

        Teacher teacher = new Teacher("Teacher");
        house.setHuman(teacher); //студента селим в хауз как хауз оунера
        //а можно без перехода
        //house.setHuman(student);
        System.out.println("Owner name: " + house.getOwnerName());
    }
}
