public class Main {

    public static void main (String[] args){
        //MessageShower message = new DotMessageShower("hello");  //JVM смотрит на какой тип указывает ссылка
        //message.show();

        showMessage(new StarMessageShower("Hello ugly world"));
        showMessage(new DotMessageShower("Hi, strange planet"));

        showMessage(new ConsoleMessageShower("Hi, huge asteroid", '~'));
    }

    //polymorphism
    private static void showMessage(MessageShower ms){
        ms.show();
    }




}
