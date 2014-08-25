public class Main {

    public static void main(String[] args){

    //static + final
    //arrays, loops: for, while, do while

        StaticFieldClass exStat = new StaticFieldClass();
        exStat.nonStaticField = 4;

        StaticFieldClass exStat1 = new StaticFieldClass();
        exStat1.nonStaticField = 3;

        //так делать не рекомендуетсяб не правильно, обращаться
        //к class level variables можно только через class.<variable>
        /*
        StaticFieldClass exStat2 = new StaticFieldClass();
        exStat2.staticField = 4;
        StaticFieldClass exStat3 = new StaticFieldClass();
        exStat3.staticField = 3;
        */
        //for example
        StaticFieldClass.staticField = 99;

        //System.out.println(exStat.nonStaticField + " " + exStat1.nonStaticField);
        //System.out.println(exStat2.staticField + " " + exStat3.staticField);
        System.out.println(StaticFieldClass.staticField);
        System.out.println("Human.MIN_AGE is " + Human.MIN_AGE);



        //static method might be start on without instance level variable
        //статич. метод может быть запущен без инстансной переменной
        //StaticFieldClass.hello();       //так неправильно!
        StaticFieldClass.hello2();



        //loops
        Field field = new Field();
        field.addSpace();
        field.showItems();

    }

}
