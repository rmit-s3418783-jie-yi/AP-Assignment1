/**********************************************************************************************************************
 * Author: JIE YI (Jay)
 * Purpose: This is the sort class for sort results in a order.
 * Create Date: 23/08/2017
 * Version: 1.28
 * Update Date: 02/09/2017
 **********************************************************************************************************************/

package NewVersion;

import java.util.Comparator;

public class ComparatorResult implements Comparator<ProcessResults> {
    @Override
    public int compare(ProcessResults o1, ProcessResults o2) {
        return o1.getAthResults() - (o2.getAthResults());
    }
}
