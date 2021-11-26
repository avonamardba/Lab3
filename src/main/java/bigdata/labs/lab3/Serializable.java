package bigdata.labs.lab3;

import java.io.Serializable;

public class flightData implements Serializable {
    private int delayedFlights;
    private int cancelledFlights;
    private float maxDelayTime;
    private int flights;

    public flightData(int delayedFlights, int cancelledFlights, int maxDelayTime, int
            flights) {
        this.delayedFlights = delayedFlights;
        this.cancelledFlights = cancelledFlights;
        this.maxDelayTime = maxDelayTime;
        this.flights = flights;
    }

    public int getDelayedFlights() {
        return delayedFlights;
    }

    public int getCancelledFlights() {
        return cancelledFlights;
    }

    public float getMaxDelayTime() {
        return maxDelayTime;
    }

    public int getFlights() {
        return flights;
    }

    private float getDelayedPercentage() {
        return (float) delayedFlights / flights * 100;
    }

    private float getCancelledPercentage() {
        return (float) cancelledFlights / flights * 100;
    }

    
}
