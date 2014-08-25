package ui.message.console;

import ui.message.IOnStringInput;
import ui.message.MessageShower;

import java.io.BufferedReader;

public class ConsoleMessageShower extends MessageShower {

    private final char symbol;  //if var final than maus declar. in constructor

    public ConsoleMessageShower(String message, char symbol, IOnStringInput onStringInput) {
        super(message, onStringInput);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        showSymbol();
        System.out.println(getMessage());
        showSymbol();
        inputString();
    }

    private void inputString(){
        BufferedReader bufferedReader = new BufferedReader(System.in);
        String stringFromUser = bufferedReader.readLine();
    }

    private void showSymbol(){
        for (int i =0; i < getMessage().length(); i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}
