package classStud;

import java.util.LinkedList;

public class SchoolClass {
    public LinkedList<Students> students;
    public SchoolClass (LinkedList<Students> students) {
        this.students = students;

    }

    public Students getBestStudent (LinkedList<Students> students) {
        students.sort(new StudentAverageAnnualMarkComparator());
        return students.getLast();
    }

}
