package ui.message.console;

import ui.message.IOnStringInput;

public class DotMessageShower extends ConsoleMessageShower {

    private static final char DOT = '.';

    public DotMessageShower (String message, IOnStringInput onStringInput){
        super(message, DOT, onStringInput);
    }

//    @Override
//    public void show(){
//        System.out.println("...............");
//        //System.out.println(getMessage());    //need a getter
//        super.show();
//        System.out.println("...............");
//    }

}
