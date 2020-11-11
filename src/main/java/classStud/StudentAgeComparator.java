package classStud;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Students> {

    @Override
    public int compare (Students s1, Students s2) {
        return Double.compare(s1.getAge(), s2.getAge());
    }
}
