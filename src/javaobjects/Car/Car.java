package javaobjects.Car;

import java.security.PublicKey;

public class Car {
    private String model;
    private String color;
    private int currentSpeed;
    private boolean isEngineStart;

    public Car(String model, String color, int currentSpeed, boolean isEngineStart) {
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.isEngineStart = isEngineStart;
    }

    public boolean startEngine(){
        return isEngineStart;
    }
    public boolean stopEngine(){
        return !isEngineStart;
    }
}
