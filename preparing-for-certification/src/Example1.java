import java.util.Arrays;

public class Example1 {

    private int[][] a = {
            {1, 3, 4},
            {3, 65, 32},
            {44, 54, 6, 3},
    };

    private int[] a2 = {3, 2};

    public static void main(String[] args){

        int[][] array = {{3, 54, 32, 3, 5}, {4, 54, 54, 22 , 5}, };
        System.out.println(Arrays.deepToString(array));
        System.out.println(array[0].getClass().isArray());

        System.out.println(new Example1().getClass().isArray());
    }

}
