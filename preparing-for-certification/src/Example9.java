public class Example9 {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 100; i++){
//            sb.append(i + " ");
//        }
//        System.out.println(sb);

        String test = "test";
        sb.append(test);
        System.out.println(sb.toString().equals(test)); //need convert stringBuilder to String
    }

}
