package javainheritance.Cars;

public class Car {
     public int passengerCount;
     public String engineType;

    public Car(int passengerCount, String engineType) {
        setPassengerCount(passengerCount);
        this.engineType = engineType;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount>2){
            this.passengerCount = passengerCount;
        }else System.out.println("Please provide right count");
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Car(){
    }
}
