package StringCollectionUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringCollectionUtil {
    public ArrayList<String> resetWordsByLength (ArrayList<String> words, int num) {
        ListIterator<String> iter = words.listIterator();

        while (iter.hasNext()) {
            if (iter.next().length() == num) {
                iter.set("*");
            }
        }
        return words;
    }
    public LinkedList<String> removeWordsByLength (LinkedList<String> words, int num) {
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            if (iter.next().length() == num) {
                iter.remove();
            }
        }
        return words;
    }
}
