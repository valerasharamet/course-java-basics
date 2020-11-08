package Class;

import java.util.LinkedList;

public class SchoolClass {
    public LinkedList<Student> students;
    public SchoolClass (LinkedList<Student> students) {
        for (Student x : students) {
            this.students.add(x);
        }
    }

    public Student getBestStudent (LinkedList<Student> students) {
        students.sort(new StudentAverageAnnualMarkComparator());
        return students.getLast();
    }

}
