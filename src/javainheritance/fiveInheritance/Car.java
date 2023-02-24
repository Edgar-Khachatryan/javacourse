package javainheritance.fiveInheritance;

public class Car {
    public int wheels;
    public String name;
    public String fuelType;


    public Car(int wheels, String name, String fuelType){
        this.wheels = wheels;
        this.name = name;
        this.fuelType = fuelType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Car(){

    }
}
