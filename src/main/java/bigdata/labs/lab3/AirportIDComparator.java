package bigdata.labs.lab3;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportIDComparator extends WritableComparator {
    public AirportIDComparator() {
    }

    public int compare(byte[] b1, int s1, int l1, byte b2[], int s2, int l2) {
        int a = readInt(b1, s1);
        int b = readInt(b2, s2);
        return Integer.compare(a, b);
    }

    public int compare(WritableComparable l, WritableComparable r) {
        AirportKeyComparable x = (AirportKeyComparable) l;
        AirportKeyComparable y = (AirportKeyComparable) r;
        return x.compareKeys(y);
    }
}
