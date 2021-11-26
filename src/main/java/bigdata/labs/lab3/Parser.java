package bigdata.labs.lab3;

public class Parser {
    String delimiter;
    String quote;
    private final String[] columns;
    private static final int AIRPORT_ID = 0;
    private static final int AIRPORT_NAME = 1;
    private static final int DEST_AIRPORT = 14;
    private static final int ORIGIN_AIRPORT = 11;
    private static final int DELAY = 18;
    private static final int CANCELLED = 19;
    private static final String EMPTY_STR = "";

    public Parser(String d, String q, String string) {
        delimiter = d;
        quote = q;
        columns = string.split(d);
    }

    public int getAirportID() {
        return Integer.parseInt(getColumn(AIRPORT_ID));
    }

    public String getAirportName() {
        return getColumn(AIRPORT_NAME);
    }

    public int getOriginAirportID() {
        return Integer.parseInt(getColumn(ORIGIN_AIRPORT));
    }

    public int getDestAirportID() {
        return Integer.parseInt(getColumn(DEST_AIRPORT));
    }

    public String getDelay() {
        return getColumn(DELAY);
    }

    public String getCancelled() {
        return getColumn(CANCELLED);
    }

    public String getColumn(int number) {
        return columns[number].replace(quote, EMPTY_STR);
    }
}

