package edu.sdccd.cisc191;

public class Car extends Vehicle{

    public Car(String name, int price){
       this.name= name;
       this.price = price;
    }

    public void gas(){
        System.out.println("Gas On");
    }
    public void brake(){
        System.out.println("Brake On");
    }
}
