package javainheritance.fiveInheritance;

public class FordFusion extends Car {
    String gearType;
    String audio;

    public FordFusion(String gearType, String audio,
                      int wheels, String name, String fuelType)
    {
        super(wheels,name,fuelType);
        this.gearType = gearType;
        this.audio = audio;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
