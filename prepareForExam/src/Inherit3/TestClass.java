package Inherit3;

/**
 * Created with IntelliJ IDEA.
 * User: l-vasil
 * Date: 17.09.14
 * Time: 9:41
 * To change this template use File | Settings | File Templates.
 */
public class TestClass {

    public static void main(String[] args){
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if (f instanceof Bird){
            System.out.println("f is a Bird");
        }
        if (e instanceof Flyer){
            System.out.println("e is a Flyer");
        }
        if (b instanceof Flyer){
            System.out.println("b is a Flyer");
        }
    }
}
