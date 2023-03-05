package TrafficLights;

public abstract class Traffic {

    protected TrafficLightsState state=TrafficLightsState.RED;

    public Traffic(TrafficLightsState state){
        this.state = state;
    }

    public abstract void changeState();


//    public enum State {
//        RED,
//        YELLOW,
//        GREEN;
//    }

}
