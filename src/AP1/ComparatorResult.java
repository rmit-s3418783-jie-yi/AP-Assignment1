package AP1;

import java.util.Comparator;

public class ComparatorResult implements Comparator<ProcessResults> {
    @Override
    public int compare(ProcessResults o1, ProcessResults o2) {
        return o1.getAthResults() - (o2.getAthResults());
    }
}
