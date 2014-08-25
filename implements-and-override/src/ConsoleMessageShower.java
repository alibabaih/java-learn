public class ConsoleMessageShower extends MessageShower {

    private final char symbol;  //if var final than maus declar. in constructor

    public ConsoleMessageShower(String message, char symbol) {
        super(message);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        showSymbol();
        System.out.println(getMessage());
        showSymbol();
    }

    private void showSymbol(){
        for (int i =0; i < getMessage().length(); i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}
