public class Method6 {

    static int si = 10;
    public static void main(String args[]){
        new Method6();
    }

    public Method6(){
        System.out.println(this);
    }

    public String toString(){
        return "TestClass.si = " + this.si;
    }

}
