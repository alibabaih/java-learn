public class Loop4 {

    public static void main(String[] args){
        int[] values = {10, 30, 50};
        for (int val : values){
            int x = 0;
            while (x < values.length){
                System.out.println(x + " " + val);
                x++;
            }
        }
    }

}
