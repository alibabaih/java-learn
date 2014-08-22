public class Student {

    //public <type> <name> [ = <initial value> ];
    public String name;

    public int age = 15;

    //public void <name> (<value>)
    public void sayHello() {
        System.out.println("Hi!");
        System.out.println("My name is " + name);
    }

    public void myAge() {
        System.out.println("My age is " + age);
    }

}
