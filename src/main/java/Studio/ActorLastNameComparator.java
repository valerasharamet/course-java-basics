package Studio;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {

    @Override
    public int compare (Actor a1, Actor a2) {
        int resualt = a1.getLastName().compareTo(a2.getLastName());
        return resualt;
    }
}
