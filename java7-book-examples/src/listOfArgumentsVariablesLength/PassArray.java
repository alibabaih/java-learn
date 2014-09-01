package listOfArgumentsVariablesLength;

//синтаксис списка аргументов переменной длины
//statiс void vaTest(int ... v) {}
public class PassArray {
    //static void vaTest(int v[]){
    static void vaTest(int ... v){
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n1[] = {10, };
        int n2[] = {1, 3, 4, };
        int n3[] = { };

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}

/*
правило содержания параметоров
int doIt(int a, double b, int ... val) //допустимо
int doIt(int a, double b, it ... val, boolean stopFlag) //ОШИБКА!
//параметр с переменным количеством аргументов должен быть последним
 */
