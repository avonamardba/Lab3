package bigdata.labs.lab3;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightsMapper extends Mapper<LongWritable, Text, AirportKeyComparable, Text> {
    private static String DELIMITER = ",";
    private static String QUOTATION = "\"";

    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        FlightParser parser = new FlightParser(DELIMITER, QUOTATION, value.toString());
        int code = parser.getDestAirportID();
        String delay = parser.getDelay();
        if (!delay.isEmpty()) {
            context.write(new AirportKeyComparable(code, 1), new Text(delay));
        }
    }
}
