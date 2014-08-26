package ui.message.console;

import ui.message.IOnStringInput;
import ui.message.MessageShower;

import java.io.*;

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

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String stringFromUser = bufferedReader.readLine();
            getOnStringInput().onStringInput(stringFromUser);   //call interface > call method > transfer string
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private void showSymbol(){
        for (int i =0; i < getMessage().length(); i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}
