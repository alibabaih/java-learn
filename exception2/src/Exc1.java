public class Exc1 {
    public static void main(String[] args){
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Деление прошло успешно");
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
    }
}
