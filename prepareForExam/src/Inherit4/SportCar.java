package Inherit4;

public class SportCar extends Car {

    public int gearRatio = 9;

    @Override
    public String accelerate(){
        return "Accelerate: Sport car";
    }

    public static void main(String[] args){
        Car c = new SportCar();
        System.out.println(c.gearRatio + " " + c.accelerate());
    }
}
