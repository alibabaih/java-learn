public class Exc7 {

    public static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args){
        try {
            throwOne();
        } catch (IllegalAccessException e){
            System.out.println("Перехвачено " + e);
        }
    }

}
