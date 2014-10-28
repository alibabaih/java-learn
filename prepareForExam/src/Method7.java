public class Method7 {

    static Method7 ref;
    String[] arguments;

    public static void main(String args[]){
        ref = new Method7();
        ref.func(args);
    }

    public void func(String[] args){
        ref.arguments = args;
    }

}
