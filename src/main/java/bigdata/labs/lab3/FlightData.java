package bigdata.labs.lab3;

import java.io.Serializable;

public class FlightData implements Serializable {
    private final int delayedFlights;
    private final int cancelledFlights;
    private final float maxDelayTime;
    private final int flights;

    public FlightData(int delayedFlights, int cancelledFlights, int maxDelayTime, int
            flights) {
        this.delayedFlights = delayedFlights;
        this.cancelledFlights = cancelledFlights;
        this.maxDelayTime = maxDelayTime;
        this.flights = flights;
    }

    public FlightData(String d, String c) {
        this.delayedFlights = d.equals("") ? 0 : 1;
        this.cancelledFlights = Integer.parseInt(c) > 0 ? 1 : 0;
        this.maxDelayTime = d.equals("") ? 0 : Float.parseFloat(d);
        this.flights = 1;
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
