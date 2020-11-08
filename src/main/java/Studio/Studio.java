package Studio;
import java.util.Comparator;
import java.util.LinkedList;

public class Studio implements Comparator<Actor> {
    public LinkedList<Actor> actors = new LinkedList<Actor>();

    public Studio (LinkedList<Actor> actors) {
        this.actors = (LinkedList<Actor>) actors.clone() ;
    }

    @Override
    public int compare (Actor a1, Actor a2) {
        return Double.compare(a1.getAge(), a2.getAge());
    }

    public LinkedList<Actor> fire(LinkedList<Actor> actors) {
        actors.sort(new ActorFeeComparator());
        actors.removeLast();
        return actors;
    }
}
