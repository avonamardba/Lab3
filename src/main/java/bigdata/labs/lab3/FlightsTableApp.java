package bigdata.labs.lab3;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class FlightsTableApp {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);
        
    }
}
