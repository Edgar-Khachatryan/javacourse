package javaabstracts.Vehicles;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        UrbanRail urban = new UrbanRail();
        urban.drive();
        Commuter commuter = new Commuter();
        commuter.drive();
    }
}
