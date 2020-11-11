package wordsMonitoring;

import java.util.Comparator;
import java.util.Map;

public class IsAscendingFrequencyComparatorFalse implements Comparator<String> {
    Map<String, Integer> base;

    public IsAscendingFrequencyComparatorFalse(Map<String, Integer> base) {
        this.base = base;
    }

    @Override
    public int compare (String a1 , String a2) {
        return base.get(a2).compareTo(base.get(a1));


    }
}
