package classStud;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Students> {

    @Override
    public int compare (Students s1, Students s2) {
        return Double.compare(s1.getAverageAnnualMark(), s2.getAverageAnnualMark());
    }
}
