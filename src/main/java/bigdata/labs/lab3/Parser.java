package bigdata.labs.lab3;

public class Parser {
    private static final String DELIMITER = ",";
    private static final String QUOTATION = "\"";
    private static final String EMPTY_STR = "";

    static String[] getColumns(String s) {
        return s.replaceAll(QUOTATION, EMPTY_STR).split(DELIMITER);
    }
}
