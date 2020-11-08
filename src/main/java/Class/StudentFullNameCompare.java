package Class;

import java.util.Comparator;

public class StudentFullNameCompare implements Comparator<Student> {

    @Override
    public int compare (Student s1, Student s2) {
        var result = s1.getSureName().compareTo(s2.sureName);
        if(result == 0) {
            return result= s1.getFirstName().compareTo(s2.sureName);
        }
        return result;
    }
}
