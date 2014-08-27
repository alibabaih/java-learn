public class Human {

    private String name;
    private int money;

    public Human(String name, int money){
        this.name = name;
        this.money = money;
    }

    public Human(String name){
        this(name, 0);  // add money already in constructor
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



    public class HumanAccaunt implements IAccaunt{
        @Override
        public void changeSum(int percent) {
            money +=percent;
        }

        @Override
        public int getSum() {
            return money;
        }
    }
//inner classes: non-static (inner) && static (nested)

//use static nested class
//OuterClass.StaticNestedClass
//OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

//use non-static inner class
//OuterClass.InnerClass innerObject = outerObject.new InnerClass();

}