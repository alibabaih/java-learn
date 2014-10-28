package vasiliy.java102.e_num;

public class TextPrinter {

    public static void showText(String text, Estyle style) {
//        switch (style){
//            case DOLLAR_STYLE: System.out.println("$" + text + "$");
//                break;
//            case A_STYLE: System.out.println("@" + text + "@");
//                break;
//            default: System.out.println(text);
//        }
        System.out.println(style.getStyleString() + text + style.getStyleString());
    }

    public static void main(String[] args) {
        showText("some text1", Estyle.valueOf("DOLLAR_STYLE"));
        showText("some text2", Estyle.valueOf("A_STYLE"));

        //showText("some text2", Estyle.valueOf("la-la"));  //it will throw exception

        showText("some text3", Estyle.DOLLAR_STYLE);
        showText("some text4", Estyle.A_STYLE);

        for (Estyle style : Estyle.values()) {
            System.out.println(style);
        }
        for (Estyle style : Estyle.values()) {
            showText("ALL STYLES", style);
        }
    }
}