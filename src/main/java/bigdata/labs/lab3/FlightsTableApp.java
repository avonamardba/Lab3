package bigdata.labs.lab3;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;

import java.util.Map;

public class FlightsTableApp {
    private static final String DELIMITER = ",";
    private static final String QUOTATION = "\"";
    private static final String FLIGHTS_FILE = "664600583_T_ONTIME_sample.csv";
    private static final String AIRPORTS_FILE = "L_AIRPORT_ID.csv";
    private static final int AIRPORT_ID = 14;
    private static final String AIRPORT_COLUMN_NAME = 


    public static void main(String[] args) {
        FlightsParser parser = new FlightsParser(DELIMITER, QUOTATION, );
        SparkConf conf = new SparkConf().setAppName("lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> flightsLines = sc.textFile(FLIGHTS_FILE);
        JavaRDD<String> airportsLines = sc.textFile(AIRPORTS_FILE);

        JavaRDD<String[]> flParsed = flightsLines.map(flightsLines.map(Parser::getColumns).filter(columns -> !columns[]))

        final Broadcast<Map<Long, String>> airportsBroadcasted = sc.broadcast(airportsLines.mapToPair(s -> new Tuple2<>()))

    }
}
