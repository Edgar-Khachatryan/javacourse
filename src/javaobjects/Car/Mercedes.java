package javaobjects.Car;

public class Mercedes {
    static Car mers = new Car(
            "Mercedes",
            "black",
            100,
            true);
    static Car bmw = new Car(
            "BMW",
            "white",
            150,
            false
    );

    public static void main(String[] args) {
        System.out.println(mers.startEngine());
    }

}
