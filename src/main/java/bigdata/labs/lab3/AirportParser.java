package bigdata.labs.lab3;


public class AirportParser {
    String delimiter;
    String quote;
    private String[] columns;
    private static int AIRPORT_ID = 0;
    private static int AIRPORT_NAME = 1;
    private static String EMPTY_STR = "";

    public AirportParser(String d, String q, String string) {
        delimiter = d;
        quote = q;

        columns = string.split(d);
    }

    public int getAirportID() {
        return Integer.parseInt(getColumn(AIRPORT_ID));
    }

    public String getName() {
        return getColumn(AIRPORT_NAME);
    }

    public String getColumn(int number) {
        return columns[number].replace(quote, EMPTY_STR);
    }
}
