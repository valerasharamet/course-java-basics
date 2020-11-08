package Studio;
import java.util.LinkedList;

public class Studio  {
    public LinkedList<Actor> actors = new LinkedList<Actor>();

    public Studio (LinkedList<Actor> actors) {
        for (Actor x : actors) {
            this.actors.add(x);
        }
    }


    public LinkedList<Actor> fire(LinkedList<Actor> actors) {
        actors.sort(new ActorFeeComparator());
        actors.removeLast();
        return actors;
    }
}
