package bigdata.labs.lab3;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class FlightsTableApp {
    private static String FLIGHTS_FILE = "664600583_T_ONTIME_sample.csv";
    private static String AIRPORTS_FILE = "L_AIRPORT_ID.csv";

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> flightsLines = sc.textFile(FLIGHTS_FILE).;
        JavaRDD<String> airportsLines = sc.textFile(AIRPORTS_FILE);


    }
}
