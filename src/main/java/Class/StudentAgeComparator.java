package Class;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare (Student s1, Student s2) {
        return Double.compare(s1.getAge(), s2.getAge());
    }
}
