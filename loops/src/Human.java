public class Human {

    //private variables can use only in the same class
    //final use when variable mustn't change

    //private final int MIN_AGE = 14;

    //слово static говорит что это поле будет одно для всех классов
    public static final int MIN_AGE = 14;
    private String name;
    private int age;

    public void setName(String newValue){
        name = newValue;
    }
    public String getName(){
        return name;
    }

    public void setAge(int newValue){
        age = newValue;
    }
    public int getAge(){
        return age;
    }

    void showHuman (){
        System.out.println(name);
        System.out.println(age);
        System.out.println();
    }

}
