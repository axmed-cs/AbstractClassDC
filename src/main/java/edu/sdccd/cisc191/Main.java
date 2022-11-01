package edu.sdccd.cisc191;

public class Main {
    public static void main(String[] args){

    Convertable ford = new Convertable("mustang", 1000,4,4);

        System.out.println("This is a " + ford.name + ". The cost is " + ford.price + ". The number of windows" +
                " is " + ford. windows + ". The number of wheels is " + ford.wheels + ".");

        ford.gas();
        ford.brake();

        ford.openRoof();
        ford.closeRoof();
    }
}