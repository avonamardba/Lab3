package bigdata.labs.lab3;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKeyComparable implements WritableComparable<AirportKeyComparable> {
    private int airportKey, datasetFlag;

    public AirportKeyComparable() {
        airportKey = 0;
        datasetFlag = 0;
    }

    public AirportKeyComparable(int key, int datasetFlag) {
        this.airportKey = key;
        this.datasetFlag = datasetFlag;
    }

    public int hashcode() {
        return Integer.hashCode(airportKey);
    }

    public int compareKeys(AirportKeyComparable z) {
        return Integer.compare(airportKey, z.airportKey);
    }

    @Override
    public int compareTo(AirportKeyComparable z) {
        if (Integer.compare(airportKey, z.airportKey) != 0) {
            return Integer.compare(airportKey, z.airportKey);
        } else {
            return Integer.compare(datasetFlag, z.datasetFlag);
        }
    }

    @Override
    public void write(DataOutput output) throws IOException {
        output.writeInt(airportKey);
        output.writeInt(datasetFlag);
    }

    @Override
    public void readFields(DataInput input) throws IOException {
        airportKey = input.readInt();
        datasetFlag = input.readInt();
    }
}
