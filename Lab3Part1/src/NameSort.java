import java.util.Comparator;

public class NameSort implements Comparator<President> {
    @Override
    public int compare(President p1, President p2) {
        return p1.name.compareTo(p2.name);
    }
}

