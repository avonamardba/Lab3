package bigdata.labs.lab3;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;

import java.util.Map;

public class FlightsTableApp {
    private static String DELIMITER = ",";
    private static String QUOTATION = "\"";
    private static String FLIGHTS_FILE = "664600583_T_ONTIME_sample.csv";
    private static String AIRPORTS_FILE = "L_AIRPORT_ID.csv";

    public static void main(String[] args) {
        Parser parser = new Parser(DELIMITER, QUOTATION, );
        SparkConf conf = new SparkConf().setAppName("lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> flightsLines = sc.textFile(FLIGHTS_FILE);
        JavaRDD<String> airportsLines = sc.textFile(AIRPORTS_FILE);

        JavaRDD<String[]> flParsed = flightsLines.map()

        final Broadcast<Map<Long, String>> airportsBroadcasted = sc.broadcast(airportsLines.mapToPair(s -> new Tuple2<>()))

    }
}
