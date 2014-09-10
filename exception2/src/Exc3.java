public class Exc3 {
    public static void main(String[] args){
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1, };
            c[42] = 99;
        } catch (ArithmeticException e){
            System.out.println("Деление на 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индекса массива: " + e);
        } finally {
            System.out.println("After try / catch box");
        }

    }
}
