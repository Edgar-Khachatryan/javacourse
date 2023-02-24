package javaobjects.City;

public class CityObjects {
    public static void main(String[] args) {
        objectCity();

    }

    public static void objectCity(){
        City yerevan = new City("Yerevan", 2000000);
        City moscow = new City("Moscow", 150000000);
        City newYork = new City("New York", 300000000);
        City paris = new City("Paris", 200000000);

        System.out.println(moscow.getName());

    }
}
