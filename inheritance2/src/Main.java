public class Main {
    public static void main(String[] args){
        Box box1 = new Box(34.3, 54, 23.4);
        double vol1 = box1.volume();
        System.out.println(vol1);

        BoxWeight box2 = new BoxWeight(34.3, 54, 23.4, 34.9);
        double vol2 = box2.weightCount();
        System.out.println(vol2);

        //----------------------
        BoxWeight test = new BoxWeight(2, 5);
        test.showI();
    }
}


