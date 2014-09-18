package Inherit5;

public class Beta extends Baap {

    public int h = 444;

    @Override
    public int getH(){
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args){
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());

        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}
