package Studio;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {

    @Override
    public int compare (Actor a1, Actor a2) {
        return Double.compare(a1.getFee(), a2.getFee());
    }
}
