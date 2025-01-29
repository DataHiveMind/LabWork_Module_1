package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class vehicle{
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;

    public vehicle(int wheels, String color,
                   float engine, String fuel){
        self.numberOfWheels = wheels;

    }

    public int get_wheels(){
        return 0;
    }
    public void set_wheels(int wheels){
        self.numberOfWheels = wheels;
    }

    public String set_color(String col){
        self.color = col;
    }
    public String get_color(){
        return "None";
    }

    public float set_engine(float eng){
        self.engineSize = eng;
    }
    public float get_engine(){
        return false;
    }

    public String set_fuel(String ft){
        self.fuelType = ft;
    }
    public String get_fuel(){
        return "None";
    }
}

class car extends vehicle{

    public car(int wheels, String color, float engine, String fuel, String brand) {
        super(wheels, color, engine, fuel);
        self.brand = brand;
    }

    void honk(){
        System.out.println("Honk, Honk");
    }
    int display(){
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        vehicle b1 = new vehicle();
        car b2 = new b2();

        // Set attributes
        b1.set_color();
        b1.set_fuel();
        b2.set_engine();
        b1.set_wheels();

        // Get attributes
        b1.get_color();
        b1.get_engine();
        b1.get_fuel();
        b1.get_wheels();


        b2.honk();
        b2.display();
    }
}