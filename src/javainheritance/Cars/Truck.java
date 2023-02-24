package javainheritance.Cars;

public class Truck extends Car{
    public String capacity;
    public Truck (String capacity, int passengerCount, String  engineType){
        super(passengerCount,engineType);
        this.capacity = capacity;
    }

    public Truck(){
    }
}
