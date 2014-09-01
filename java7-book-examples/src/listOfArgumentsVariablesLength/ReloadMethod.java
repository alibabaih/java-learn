package listOfArgumentsVariablesLength;
//перезагрузка метода
//1. типы параметорв с переменным колисеством агрументов различаются: int boolean
//2. добавление 1ого или нескольких параметоров: String

public class ReloadMethod {
    static void vaTest(int ... v){
        System.out.print("vaTest(int ... ): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean ... ): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for(boolean x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String, int ... ): " + "Количество аргументов: " + msg + v.length + " Содержимое: ");

        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        vaTest(1, 2, 4);
        vaTest("Проверка: ", 2, 4, 5);
        vaTest(true, false, true, false);
    }
}
