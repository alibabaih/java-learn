package vasiliy.java102.e_num;
//enum do not allow to create instance out of it class
public enum Estyle {

    DOLLAR_STYLE("$"), A_STYLE("@"), EMPTY_STYLE;

    private final String styleString;

    Estyle(String styleString) {
        this.styleString = styleString;
    }

    Estyle() {
        this.styleString = "";
    }

    public String getStyleString(){
        return styleString;
    }

}
