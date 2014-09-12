package Exc2;

public class Exc2 {

    public static void main (String[] args) {
        try {
            doSomething();
        } catch (MySpecialException e) {
            System.out.println(e);
        }
    }

    static void doSomething() {
        int[] array = new int[4];
        array[4] = 4;
        doSomethingElse();
    }

    static void doSomethingElse() {
        throw new MySpecialException("Sorry, can't do something else");
    }

}
