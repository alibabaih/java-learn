//nested try blocks
public class Exc5 {
    public static void main(String[] args){
        try {
            int a = args.length;
            //усли не указан текст с командной строки, то деление на ноль
            int b = 42 / a;
            System.out.println("a = " + a);
            try {
                //если введён 1 символ с командной строки, то
                if(a == 1){
                    a = a / (a - a);
                }
            } catch (ArithmeticException e){
                System.out.println("Внутренний кэтч");
            }
        } catch (ArithmeticException e){
            System.out.println("Внешний кэтч");
        }
    }
}
