package wordsMonitoring;

import java.util.Comparator;
import java.util.Map;

public class IsAscendingFrequencyComparatorTrue implements Comparator<String> {
    Map<String, Integer> base;

    public IsAscendingFrequencyComparatorTrue(Map<String, Integer> base) {
        this.base = base;
    }

    @Override
    public int compare (String a1 , String a2) {
        if(base.get(a1) == base.get(a2)) {
            return 1;
        } else {
            return base.get(a1).compareTo(base.get(a2));
        }
    }
}
