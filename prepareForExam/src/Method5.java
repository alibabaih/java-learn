public class Method5 {

    static Method5 ref;
    String[] arguments;
    public static void main(String args[]){
        ref = new Method5();
        ref.func(args);
    }
    public void func(String[]args){
        ref.arguments = args;
    }

}
