public class Example6 {

    public static void main(String[] args){
        Integer a = 200;
        Integer b = 200;
        Integer c = 25;
        Integer d = 25;
        Integer e = new Integer(d);
        //Java has a cash which save values -128 127

        System.out.println(a == b);


        System.out.println(a.equals(b));
        System.out.println(c == d); //that's why here true
        System.out.println(c == e);

        String test1 = "test";
        String test2 = "test";
        System.out.println(test1 == test2); //true
        System.out.println(test1.equals(test2));



    }

}
