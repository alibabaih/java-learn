import ui.message.MessageShower;
//import ui.message.IOnStringInput;
import ui.message.StringListener;
import ui.message.console.ConsoleMessageShower;
import ui.message.console.DotMessageShower;
import ui.message.console.StarMessageShower;

public class Main {

    public static void main (String[] args){
        //ui.message.MessageShower message = new ui.message.console.DotMessageShower("hello");  //JVM смотрит на какой тип указывает ссылка
        //message.show();
        StringListener stringListener = new StringListener();


        showMessage(new StarMessageShower("Hello ugly world", stringListener));
        showMessage(new DotMessageShower("Hi, strange planet", stringListener));

        showMessage(new ConsoleMessageShower("Hi, huge asteroid", '~', stringListener));
    }

    //polymorphism
    private static void showMessage(MessageShower ms){
        ms.show();
    }




}
