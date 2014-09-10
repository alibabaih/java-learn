import java.util.Random;
public class Exc2 {
    public static void main(String[] args){
        int a = 0, b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < 32000; i++){
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e){
                System.out.println("Деление на ноль");
                a = 0;  //присвоить 0 и продолжить работу
            }
            System.out.println("a: " + a);

        }
    }
}
