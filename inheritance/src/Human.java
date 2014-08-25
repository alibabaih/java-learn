public class Human {

    //private static final String N_A = "N/A";

    private final String name;
    private int age = 0;
    /*
    public Human(){
        System.out.println("I'm in default constructor");
        this.name = N_A;
    }
    */
    public Human(String name) {
        this.name = name;
        System.out.println("I'm in human constructor");
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void birthday(){
        age++;
    }

}
