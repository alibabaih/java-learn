public class B extends A {

    int r;

    B(int i, int j, int r){
        super(i, j);
        this.r = r;
    }

    void show(){
        System.out.println(r);
    }

}
