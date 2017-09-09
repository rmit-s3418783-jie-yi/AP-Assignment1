/**********************************************************************************************************************
 * Author:
 * Purpose: This is the control class that can hold most function and method to run a game.
 * Create Date: 28/07/2017
 * Version: 1.15
 * Update Date: 04/09/2017
 **********************************************************************************************************************/

package NewVersion;

import java.util.Comparator;

public class ComparatorResult implements Comparator<ProcessResults> {
    @Override
    public int compare(ProcessResults o1, ProcessResults o2) {
        return o1.getAthResults() - (o2.getAthResults());
    }
}
