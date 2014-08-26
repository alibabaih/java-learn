import ui.message.SernameNumberListener;
import ui.message.InputNameListener;
import ui.message.MessageShower;
//import ui.message.IOnStringInput;
import ui.message.console.DotMessageShower;
import ui.message.console.StarMessageShower;

public class Main {

    public static void main (String[] args){
        //ui.message.MessageShower message = new ui.message.console.DotMessageShower("hello");  //JVM смотрит на какой тип указывает ссылка
        //message.show();
        InputNameListener inputNameListener = new InputNameListener();

        //StringListener stringListener = new StringListener();

        showMessage(new StarMessageShower("What is your name? ", inputNameListener));
        showMessage(new DotMessageShower("What is your surname? ", new SernameNumberListener()));   //impleVment immediately

        //showMessage(new ConsoleMessageShower("Hi, huge asteroid", '~', stringListener));
    }

    //polymorphism
    private static void showMessage(MessageShower ms){
        ms.show();
    }




}
