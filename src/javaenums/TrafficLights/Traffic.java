package javaenums.TrafficLights;

public abstract class Traffic {

    protected TrafficLightsState state=TrafficLightsState.RED;

    /**
     * setting state to current state
     * @param state
     */

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
