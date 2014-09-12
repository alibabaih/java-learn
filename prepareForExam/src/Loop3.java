public class Loop3 {
    public static void main(String[] args){
        String String = " ";    //this is valid!
        String : for(int i = 0; i < 10; i++){   //this is valid too!
            for(int j = 0; j < 10; j++){
                if(i + j > 10) break String;
            }
            System.out.println("hello");
        }
    }
}
