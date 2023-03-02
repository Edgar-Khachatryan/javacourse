package Planets;

public class Main {
    public static void main(String[] args) {
        for (Planets planet : Planets.values()) {
            System.out.println(planet.getName() + " " + planet.getYearLength() + " days on Earth.");
        }
    }
}
