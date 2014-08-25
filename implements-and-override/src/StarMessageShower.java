public class StarMessageShower extends ConsoleMessageShower {

    private static final char ASTERISK = '*';

    public StarMessageShower (String message){
        super(message, ASTERISK);
    }

//    @Override
//    public void show(){
//        showAsterisk();
//        //System.out.println(getMessage());    //need a getter
//        super.show();   //call parent show method
//        showAsterisk();
//        //System.out.println("***************");
//    }

//    private void showAsterisk(){
//        for (int i =0; i < getMessage().length(); i++){
//            System.out.print(ASTERISK);
//        }
//        System.out.println();
//    }


}
