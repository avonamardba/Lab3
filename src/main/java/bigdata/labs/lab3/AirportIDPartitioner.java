package bigdata.labs.lab3;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportIDPartitioner extends Partitioner<AirportKeyComparable, Text> {

    @Override
    public int getPartition(AirportKeyComparable airportKey, Text flag, int i) {
        return airportKey.hashcode() % i;
    }
}
