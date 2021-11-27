package bigdata.labs.lab3;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;

import java.util.Map;

@SuppressWarnings("ALL")
public class FlightsTableApp {
    private static final String FLIGHTS_FILE = "664600583_T_ONTIME_sample.csv";
    private static final String AIRPORTS_FILE = "L_AIRPORT_ID.csv";
    private static final int DEST_AIRPORT_ID = 14;
    private static final String DEST_AIRPORT_COLUMN_NAME = "DEST_AIRPORT_ID";
    private static final int AIRPORT_ID = 0;
    private static final String AIRPORT_COLUMN_NAME = "Code";


    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);

//        JavaRDD<String> flightsLines = sc.textFile(FLIGHTS_FILE);
//        JavaRDD<String> airportsLines = sc.textFile(AIRPORTS_FILE);
//
//        JavaRDD<String[]> flParsed = flightsLines
//                .map(Parser::getColumns)
//                .filter(columns -> !columns[DEST_AIRPORT_ID].equals(DEST_AIRPORT_COLUMN_NAME));
//
//        JavaRDD<String[]> alParsed = airportsLines
//                .map(Parser::getColumns)
//                .filter(columns -> !columns[AIRPORT_ID].equals(AIRPORT_COLUMN_NAME));
//
//        JavaPairRDD<Tuple2, FlightData> flightPairs = flParsed
//                .mapToPair(columns -> {
//                    FlightsParser p = new FlightsParser(columns);
//                    return new Tuple2<>(new Tuple2<>(p.getOriginAirportID(), p.getDestAirportID()),
//                            new FlightData(p.getDelay(), p.getCancelled()));
//                });
//
//        JavaPairRDD<Tuple2, FlightData> flightsTable = flightPairs.reduceByKey(FlightData::reduceMethod);
//
//        final Broadcast<Map<Integer, String>> airportsBroadcast = sc.broadcast(alParsed
//                .mapToPair(columns -> {
//                    FlightsParser p = new FlightsParser(columns);
//                    return new Tuple2<>(p.getAirportID(), p.getAirportName());
//                }).collectAsMap());
//        JavaRDD<String> output = flightsTable.map(p -> String.format("%s, %s, %s", airportsBroadcast.value().get(p._1._1), airportsBroadcast.value().get(p._1._2), p._2.getResult()));
//        output.saveAsTextFile("output");
    }
}