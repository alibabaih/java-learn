package Inherit1;

public class Inh2 extends Inh1 {
    int fi = 15;    //final variable can be shadowed
    public static void main(String[] args){
        Inh2 inh2 = new Inh2();
        inh2.fi = 20;
        System.out.println(inh2.fi);
        System.out.println(((Inh1)inh2).fi );
    }
}
