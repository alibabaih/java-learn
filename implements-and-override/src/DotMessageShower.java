public class DotMessageShower extends ConsoleMessageShower {

    private static final char DOT = '.';

    public DotMessageShower (String message){
        super(message, DOT);
    }

//    @Override
//    public void show(){
//        System.out.println("...............");
//        //System.out.println(getMessage());    //need a getter
//        super.show();
//        System.out.println("...............");
//    }

}
