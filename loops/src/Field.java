public class Field {

    public static final int FIELD_SIZE = 3;
    public static final char ADD_SPACE = ' ';


                                   //сколько элементов в массиве
    //private char[] items = new char[FIELD_SIZE];

    //двухмерный массив
    private char[][] items = new char[FIELD_SIZE][FIELD_SIZE];

    public void showItems(){
        for(int i = 0; i < FIELD_SIZE; i++){
                showCell(i);
            System.out.println();
        }
//        showCell(0);
//        showCell(1);
//        showCell(2);
    }

    //запихиваем в массив пробелы
    public void addSpace(){
        for (int i = 0; i < FIELD_SIZE; i++) {
           for (int i2 = 0; i2 < FIELD_SIZE; i2++){
               items[i][i2] = ADD_SPACE;
           }
            //или вместо вложенного цикла вставляем метод и туда передаём значения подмассива
            //и туда передаём номер линии
            addLineSpace(i);

        }
//        items[0] = ' ';
//        items[1] = ' ';
//        items[2] = ' ';
    }
    //для читаемости кода можно разбить на подметоды
    private void addLineSpace(int lineNumber){
        for (int i = 0; i < FIELD_SIZE; i++){
            items[i][lineNumber] = ' ';
        }
    }

    //private void showCell(int i){
    //   System.out.print("[" + items[i] + "]");
    //}
    //но в случае использования подметода нужно переделать метод showCell
    private void showCell(int x, int y){
        System.out.print("[" + items[x][y] + "]");
    }

}


//
// [] [] []
//цикл for
//for (int i = 0; i < 100; i++){
//
//}

//вечный цикл for(;;) { }
//для того, чтобы достучаться до  многомерный массивов нужны вложенные циклы