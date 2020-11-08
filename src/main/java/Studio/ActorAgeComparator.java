package Studio;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {

    @Override
    public int compare (Actor a1, Actor a2) {
        return Double.compare(a1.getAge(), a2.getAge());
    }
}
