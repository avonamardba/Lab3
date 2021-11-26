package bigdata.labs.lab3;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportsMapper extends Mapper<LongWritable, Text, AirportKeyComparable, Text> {
    private static String DELIMITER = ",";
    private static String QUOTATION = "\"";

    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        AirportParser parser = new AirportParser(DELIMITER, QUOTATION, value.toString());
        int code = parser.getAirportID();
        String name = parser.getName();
        context.write(new AirportKeyComparable(code, 0), new Text(name));
    }
}
