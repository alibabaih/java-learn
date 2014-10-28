public class Loop1 {
    public static void main(String[] args){
        int i, j;
        for(i = 0, j = 0; j<1; ++j, i++ ){
            System.out.println("in loop");
            System.out.println(i+ " " + j);
        }
        System.out.println("not in loop");
        System.out.println(i + " " + j);
    }
}
