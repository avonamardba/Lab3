package bigdata.labs.lab3;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirportReducer extends Reducer<AirportKeyComparable, Text, Text, Text> {
    @Override
    protected void reduce(AirportKeyComparable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();

        int count = 0;
        double max = 0, min = 1000000, sum = 0;

        String airportName = iter.next().toString();
        while (iter.hasNext()) {
            count++;

            double currDelay = Double.parseDouble(iter.next().toString());
            min = Double.min(min, currDelay);
            max = Double.max(max, currDelay);
            sum += currDelay;
        }

        if (count > 0) {
            String delayString = min + " " + max + " " + sum / count;
            context.write(new Text(airportName), new Text(delayString));
        }
    }
}
