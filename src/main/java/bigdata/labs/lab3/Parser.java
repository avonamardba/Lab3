package bigdata.labs.lab3;

public class Parser {
    private static String DELIMITER = ",";
    private static String QUOTATION = "\"";
    private static final String EMPTY_STR = "";

    static String[] getColumns(String s) {
        return s.replaceAll(QUOTATION, EMPTY_STR).split(DELIMITER);
    }
}
