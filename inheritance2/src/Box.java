public class Box {

    public double width;
    public double height;
    public double depth;

    Box(Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double cube){   //cube constructor
        width = height = depth = cube;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    double volume(){
        return width * height * depth;
    }

    //------------------------------------
    int i;

}
