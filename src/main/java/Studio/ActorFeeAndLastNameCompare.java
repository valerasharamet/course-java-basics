package Studio;

import java.util.Comparator;

public class ActorFeeAndLastNameCompare implements Comparator<Actor> {

    @Override
    public int compare (Actor a1, Actor a2) {
        var result = Double.compare(a1.getFee(), a2.getFee());
        int res;
        if(result == 0) {
            return res = a1.getLastName().compareTo(a2.getLastName());
        }
        return result;
    }
}
