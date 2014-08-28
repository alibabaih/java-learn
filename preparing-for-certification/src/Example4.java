public class Example4 {

    public static void main(String[] args){
        System.out.println(randomInt(100));
    }

    private static float randomInt(float r){
        return (float) (Math.random() * r);
    }



}
