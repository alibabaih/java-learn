public class BoxWeight extends Box {
//super(list_of_arguments);
//super.member; where member is method or instance

    double weight;

    BoxWeight(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }

    double weightCount(){
        return width * height * depth * weight;
    }

    //------------------------------------
    int i; //this var hide var i in Box class
    BoxWeight(int a, int b){
        super.i = a; //i in the Box class
        i = b;
    }

    public void showI(){
        System.out.println("i в суперклассе" + super.i);
        System.out.println("i в подклассе" + i);
    }


}
