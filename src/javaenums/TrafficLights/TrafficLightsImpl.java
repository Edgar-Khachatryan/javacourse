package javaenums.TrafficLights;

import org.w3c.dom.ls.LSOutput;

public class TrafficLightsImpl extends Traffic {
    protected TrafficLightsState previousState=TrafficLightsState.YELLOW;

    public TrafficLightsImpl() {
        super(TrafficLightsState.RED);
        previousState = TrafficLightsState.YELLOW;
    }

    /**
     * overiding changeState and setting conditions
     */

    @Override
    public void changeState() {
        if (state == TrafficLightsState.RED || state == TrafficLightsState.GREEN){
            setState(TrafficLightsState.YELLOW);
            System.out.println(state);
        } else if (previousState==TrafficLightsState.GREEN) {
            setState(TrafficLightsState.RED);
            System.out.println(TrafficLightsState.RED);
        } else if (previousState == TrafficLightsState.RED) {
            setState(TrafficLightsState.GREEN);
            System.out.println(TrafficLightsState.GREEN);
        }
    }

    protected void setState(TrafficLightsState state) {
        this.previousState = this.state;
        this.state = state;
    }
}
