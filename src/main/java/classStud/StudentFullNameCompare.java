package classStud;

import java.util.Comparator;

public class StudentFullNameCompare implements Comparator<Students> {

    @Override
    public int compare (Students s1, Students s2) {
        var result = s1.getSurName().compareTo(s2.getSurName());
        if(result == 0) {
            return result= s1.getFirstName().compareTo(s2.getSurName());
        }
        return result;
    }
}
