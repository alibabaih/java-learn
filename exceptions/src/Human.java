import exceptions.IllegalHumanNameException;

public class Human {
    private static final int MIN_NAME_LENGTH = 2;
    private String name;
    private int money;

    public Human createInstance(String name) throws IllegalHumanNameException{
        if (name == null || name.length() < MIN_NAME_LENGTH){
            throw new IllegalHumanNameException(name); //method throws up exception
        }
        return new Human(name);
    }


    //close ability create class from outside: private
    private Human(String name, int money){
        this.name = name;
        this.money = money;
    }

    private Human(String name){
        this.name = name;
    }

    /*
    private Human(String name){
        this(name, 0);  // add money already in constructor
    }
    */


    private void setName(String name){
        if (name != null){
            this.name = name;
        } else {
            System.out.println("Mistaken field.");
        }
    }
    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    @Override
    public String toString(){
        return name;
    }

//    void changeMoney (int percent){
//        this.money += percent;
//    }


//inner classes: non-static (inner) && static (nested)

//use static nested class
//OuterClass.StaticNestedClass
//OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

//use non-static inner class
//OuterClass.InnerClass innerObject = outerObject.new InnerClass();

}