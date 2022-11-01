package edu.sdccd.cisc191;

public class Convertable extends Car{

    public int wheels;
    public int windows;

    public Convertable(String CarName, int price, int wheels, int windows) {
        super(CarName, price);
        this.wheels = wheels;
        this.windows = windows;
    }
    public void openRoof(){
        System.out.println("Opening Roof...");
    }

    public void closeRoof(){
        System.out.println("Closing Roof...");
}
}

