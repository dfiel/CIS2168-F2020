import java.util.Comparator;

public class YearSort implements Comparator<President> {
    @Override
    public int compare(President p1, President p2) {
        return p1.year - p2.year;
    }
}
