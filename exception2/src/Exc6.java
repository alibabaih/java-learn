public class Exc6 {
    static void demo(){
        try {
            throw new NullPointerException("demo null pointer exception");
        } catch (NullPointerException e){
            System.out.println("Перехвачено внутри метода demo");
            throw e;    //повторно передать исключение
        }
    }

    public static void main(String[] args){
        try {
            demo();
        } catch (NullPointerException e){
            System.out.println("Повторный перехват " + e);
        }
    }

}
