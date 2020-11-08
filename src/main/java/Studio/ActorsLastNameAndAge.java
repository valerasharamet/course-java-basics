package Studio;

import java.util.Comparator;

public class ActorsLastNameAndAge implements Comparator<Actor> {

    @Override
    public int compare (Actor a1, Actor a2) {
        var result = a1.getLastName().compareTo(a2.getLastName());
        if(result == 0) {
           return Double.compare(a1.getAge(),a2.getAge());
        }
        return result;
    }
}
