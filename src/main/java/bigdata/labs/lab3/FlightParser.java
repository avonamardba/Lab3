package bigdata.labs.lab3;

public class FlightParser {
    String delimiter;
    String quote;
    private String[] columns;
    private static int DEST_AIRPORT = 14;
    private static int AIRPORT = 0;
    private static int DELAY = 18;
    private static String EMPTY_STR = "";

    public FlightParser(String d, String q, String string) {
        delimiter = d;
        quote = q;
        columns = string.split(d);
    }

    public int getAirportID() {
        return Integer.parseInt(getColumn(DEST_AIRPORT));
    }
    public int getDestAirportID() {
        return Integer.parseInt(getColumn(AIRPORT));
    }

    public String getDelay() {
        return getColumn(DELAY);
    }

    public String getColumn(int number) {
        return columns[number].replace(quote, EMPTY_STR);
    }
}

