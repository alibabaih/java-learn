/*
если имя и сигнатура типа метода подкласса совпадает с атрибутами метода суперкласса
то метод переопределяет метод суперкласса
 */
public class Main {

    public static void main(String[] args){
        A v1 = new A(3, 5);
        v1.show();

        B v2 = new B(3, 5, 6);
        v2.show();
    }

}
